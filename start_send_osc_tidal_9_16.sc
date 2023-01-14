SuperDirt.start;

(
var addr = NetAddr.new("127.0.0.1", 7000);
OSCFunc({
arg msg;
if(msg[2] == '9', {addr.sendMsg("/tidal_9", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '10', {addr.sendMsg("/tidal_10", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '11', {addr.sendMsg("/tidal_11", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '12', {addr.sendMsg("/tidal_12", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '13', {addr.sendMsg("/tidal_13", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '14', {addr.sendMsg("/tidal_14", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '15', {addr.sendMsg("/tidal_15", *msg)}, {});
},'/dirt/play').fix;
OSCFunc({
arg msg;
if(msg[2] == '16', {addr.sendMsg("/tidal_16", *msg)}, {});
},'/dirt/play').fix;
)