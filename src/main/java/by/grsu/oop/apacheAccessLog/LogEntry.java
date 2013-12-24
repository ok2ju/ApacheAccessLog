package by.grsu.oop.apacheAccessLog;

import by.grsu.oop.apacheAccessLog.model.Client;
import by.grsu.oop.apacheAccessLog.model.Date;
import by.grsu.oop.apacheAccessLog.model.Error;
import by.grsu.oop.apacheAccessLog.model.Ip;
import by.grsu.oop.apacheAccessLog.model.Method;
import by.grsu.oop.apacheAccessLog.model.ObjectSize;
import by.grsu.oop.apacheAccessLog.model.Path;
import by.grsu.oop.apacheAccessLog.model.Protocol;

public class LogEntry {
	
	private Client client;
	private Date date;
	private Error error;
	private Ip ip;
	private Method method;
	private ObjectSize objectSize;
	private Path path;
	private Protocol protocol;
	
	public LogEntry(Client client, Date date, Error error,
			Ip ip, Method method, ObjectSize objectSize,
			Path path, Protocol protocol){
		this.client = client;
		this.date = date;
		this.error = error;
		this.ip = ip;
		this.method = method;
		this.objectSize = objectSize;
		this.path = path;
		this.protocol = protocol;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Ip getIp() {
		return ip;
	}

	public void setIp(Ip ip) {
		this.ip = ip;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public ObjectSize getObjectSize() {
		return objectSize;
	}

	public void setObjectSize(ObjectSize objectSize) {
		this.objectSize = objectSize;
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
		
}
