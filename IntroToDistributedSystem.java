// Introduction to Distributed System
/*
1) Companies are running Highly scalable distributed systems in order to handle millions of users
2) Simplest website also running on distributed systems as cloud itself is a distributed system
3) Centralised system is opposite of distributed system - We can do Vertical scaling to solve the problem as Pweformance and storange are limited
4) In Centralised system if there is failure then it acts as a single point of failure, High latency, security and privacy
5) In Horizontal scalability allows the system to grow and shrink on demand
6) "A distributed system is a system of several processes running on ddiffrent computers communicating with each other through the network and are sharing a state  or are working
    together to achieve a common goal."
7) Process: After compiling our application into an executable class or jar file its stored in the file system. When we launch application the OS creates an instance in memory and
   the instance is the process and its isolated from other process 
8) Inter Process Communication: Process running on same machine can communicate with each other through network, filesystem and memory 
9) Node: Its a process running on its dedicated machine
10) Cluster: collecion of nodes connected to each other
11) Automatic leader from all nodes in the cluster
12) Apache Zookeper: Its highperformance co ordination service, It provides abstraction layer for higher level distributed algorithms, provides high availability and reliability
13) Typically runs in a cluster of odd number of nodes, higher than 3, Each element in Filesystem of Zookeper is Znodes which is hybrid of file and directory
14) Types of Znodes: 1) Persistent: stays between sessions(If there is disconnection btw app and Zookeper then after reconneting it remains same) 2) Ephemeral: Its deleted when 
session ends
15) Leader Election Algorithm: 
Step 1 : Add Znodes to the election parent. step 2 : As Znodes are order in the way they are added. step 3: Leader is slected according to the order of addtion
16) Zoo.cfg file with in the conf folder of zookeeper will configure zookeeper as standalone cluster
17) zkServer.cmd (windows) , zkCli.cmd , create path date (to create znode) eg: create /parent "some data", get /parent(get information about znode)
18) There are no znodes stored in our file system - its a representation of the zookeeper in-memory data model
19) Zookeeper Thread Model: When application starts in the main method then its executed on the main thread
When Zookeeper object is created, two additional threads are created:
-> Event Thread : Handles zookeeper client state changes and manages events like : Connection, Disconnection
-> IO Thread : Handles Network communication btw zookeeper and application
20) Project: Maven - Its a build automation tool gets all dependencies
21)
22)
*/