package gg.archipelago.APClient.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APPacket {

    @Expose
    @SerializedName("cmd")
    public APPacketType cmd;

}
