module undertow.websockets.jsr {

	exports io.undertow.websockets.jsr;
	//exports io.undertow.websockets.jsr.util;
	exports io.undertow.websockets.jsr.annotated;
	//exports io.undertow.websockets.jsr.handshake;


	requires javax.websocket.api;
	requires undertow.servlet;

	requires undertow.core;
	requires xnio.api;
	requires javax.servlet.api;

	uses io.undertow.websockets.jsr.WebsocketClientSslProvider;

	provides javax.websocket.ContainerProvider with io.undertow.websockets.jsr.UndertowContainerProvider;
	provides javax.websocket.server.ServerEndpointConfig.Configurator with io.undertow.websockets.jsr.DefaultContainerConfigurator;
	provides io.undertow.websockets.jsr.WebsocketClientSslProvider with io.undertow.websockets.jsr.DefaultWebSocketClientSslProvider;
	provides io.undertow.servlet.ServletExtension with io.undertow.websockets.jsr.Bootstrap;
}