package lyyljs.cloud.eureka.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("server.register")
public class FatherConfig {
	private int port2 = 0;

	@NestedConfigurationProperty
	private SubConfig subConfig = new SubConfig();
	
	public int getPort2() {
		return port2;
	}

	public void setPort2(int port2) {
		this.port2 = port2;
	}

	public SubConfig getSubConfig() {
		return subConfig;
	}

	public void setSubConfig(SubConfig subConfig) {
		this.subConfig = subConfig;
	}

	@Override
	public String toString() {
		return "FatherConfig [port2=" + port2 + ", subConfig=" + subConfig + "]";
	}
	
	
}
