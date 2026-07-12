📌 Wireshark - Important Concepts Learned
1. What is Wireshark?
Wireshark is a packet analyzer (packet sniffer).
It captures packets traveling through a network interface.
It allows us to inspect communication at every layer of the TCP/IP (OSI) model.
2. Packet Filtering

Instead of viewing every packet on the network, Wireshark allows filtering.

Example:

http

This displays only HTTP packets.

Filtering helps analyze specific protocols easily.

3. Real HTTP Communication

When a browser accesses

http://192.168.1.3

the client sends an HTTP GET request to the server.

The server then replies with the requested webpage.

4. Wireshark Shows Every TCP/IP Layer

A single captured packet can be expanded to view:

Layer	Information Displayed
Layer 1	Frame size (bits/bytes on wire)
Layer 2	Ethernet header (MAC addresses)
Layer 3	IPv4 header (IP addresses)
Layer 4	TCP header (Port numbers)
Layer 5/Application	HTTP data

This makes Wireshark an excellent tool for understanding protocol encapsulation.

5. Frame Size

Wireshark displays:

Total frame size
Bytes on the wire
Bits transmitted

Example:

578 Bytes
4624 Bits

This represents the actual Ethernet frame sent across the network.

6. MAC Address Vendor Identification

Wireshark identifies the manufacturer of a network card using the first half of the MAC address.

Example:

Dell
TP-Link
Intel
Realtek

The first 24 bits of a MAC address are called the OUI (Organizationally Unique Identifier) and identify the vendor.

7. Ethernet Type Field

Inside the Ethernet header is a Type field.

It tells Layer 2 which Layer 3 protocol is encapsulated.

Example:

EtherType = IPv4

Other possible values include IPv6 and ARP.

8. TCP Protocol Field

Inside the IPv4 header is the Protocol field.

Example:

Protocol = 6

Protocol number 6 indicates TCP.

Common protocol numbers:

6 → TCP
17 → UDP
1 → ICMP
9. Dynamic (Ephemeral) Ports

The client does not use port 80.

Instead, the operating system assigns a temporary source port.

Example:

Source Port : 63700
Destination Port : 80

These temporary ports are called:

Ephemeral Ports
Dynamic Ports
Private Ports
10. Modern Windows Ephemeral Port Range

Modern Windows follows IANA recommendations.

Typical ephemeral port range:

49152 - 65535

Each new connection usually receives a temporary port from this range.

11. HTTP Server Uses Port 80

An HTTP server listens on:

Port 80

Every browser automatically sends HTTP requests to destination port 80 unless another port is specified.

12. Request vs Response
Client Request
Source IP       -> Client
Destination IP  -> Server

Source Port     -> Ephemeral Port
Destination Port-> 80
Server Response

Everything is reversed.

Source IP       -> Server
Destination IP  -> Client

Source Port     -> 80
Destination Port-> Client's Ephemeral Port

The MAC addresses also swap because the direction of communication changes.

13. Multiple Browser Sessions

Each browser session receives its own temporary source port.

Example:

Chrome Tab 1 → 63700
Chrome Tab 2 → 63703
Edge         → 63706

The destination port remains:

80

This allows the server to handle multiple simultaneous connections.

14. Ephemeral Ports May Be Reused

Closing and reopening a browser does not guarantee a new source port.

Sometimes Windows reuses the same ephemeral port if it is available.

15. Practical TCP/IP Communication

A real HTTP request follows this path:

HTTP Request
        ↓
TCP Segment
        ↓
IPv4 Packet
        ↓
Ethernet Frame
        ↓
Bits on the Wire

Wireshark displays each of these layers separately, making encapsulation visible in real network traffic.

⭐ Key Takeaways
Wireshark captures and analyzes live network packets.
Protocol filters (e.g., http) simplify packet analysis.
A packet reveals information from every TCP/IP layer.
The Ethernet Type field identifies the Layer 3 protocol (e.g., IPv4).
IPv4's Protocol field identifies the Layer 4 protocol (e.g., TCP = 6).
Clients use temporary ephemeral ports; servers listen on well-known ports like 80 for HTTP.
Server responses reverse the source and destination MAC addresses, IP addresses, and port numbers.
Multiple browser sessions use different ephemeral ports while communicating with the same server.
Wireshark can identify the network adapter vendor using the MAC address's OUI.
Seeing encapsulation in Wireshark bridges the gap between theory (OSI/TCP-IP models) and real-world network communication.