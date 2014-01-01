package ch.spacebase.mc.protocol.packet.ingame.client.entity.player;

public class ClientPlayerRotationPacket extends ClientPlayerMovementPacket {

	public ClientPlayerRotationPacket() {
		this.rot = true;
	}
	
	public ClientPlayerRotationPacket(boolean onGround, double yaw, double pitch) {
		super(onGround);
		this.rot = true;
		this.yaw = yaw;
		this.pitch = pitch;
	}

}