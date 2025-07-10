# -CHAT-APPLICATION

 COMPANY: CODTECH IT SOLUTIONS

 NAME: BHUVANESWARI S

 DOMAIN: FULL STACK WEB DEVELOPMENT

 DURATION: 4 WEEKS

 MENTOR: NEELA SANTOSH


ChatTime – Real-Time WebSocket Chat Application

ChatTime is a sleek and powerful real-time messaging platform built using 'Spring Boot', 'WebSockets', and a 'vanilla JavaScript frontend'. It enables instant communication with no user registration. Simply enter a username and start chatting — live, fast, and responsive.

This project is perfect for developers looking to learn real-time communication, build collaborative tools, or create chat-enabled applications with modern web technologies.


 Key Features:

-  Instant one-click chat login (no signup)
-  Live real-time messaging via WebSocket
-  Color-coded avatars based on username
-  Join/leave system notifications
-  Fully responsive design (mobile & desktop)
-  Backend powered by Spring Boot (STOMP/WebSocket)
-  Clean frontend using HTML, CSS, JavaScript


 How It Works:

1. User opens `index.html` and navigates to the chat page.
2. User enters a username, triggering a WebSocket connection.
3. The frontend connects using "SockJS" and "STOMP" to `/chat-websocket`.
4. User subscribes to `/topic/public` and sends JOIN/CHAT messages via:
   - `/app/chat.addUser`
   - `/app/chat.sendMessage`
5. Backend broadcasts messages to all clients subscribed to `/topic/public`.


 Tech Stack:

 Layer            Technology                     

 Frontend    -  HTML5, CSS3, JavaScript        
 Messaging   -  WebSocket + STOMP + SockJS     
 Backend     -  Spring Boot (Java)             
 Build Tool  -  Maven                 
 CDN Libs    -  STOMP.js, SockJS               


License:

This project is released for educational and personal use. You may extend, customize, and deploy freely with attribution.

