package ic;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public class z0 extends cc.b {

    /* renamed from: e  reason: collision with root package name */
    protected static final HashMap<Integer, String> f30353e;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f30353e = hashMap;
        hashMap.put(255, "Makernote Offset");
        hashMap.put(256, "Sanyo Thumbnail");
        hashMap.put(512, "Special Mode");
        hashMap.put(513, "Sanyo Quality");
        hashMap.put(Integer.valueOf((int) SyslogConstants.SYSLOG_PORT), "Macro");
        hashMap.put(516, "Digital Zoom");
        hashMap.put(519, "Software Version");
        hashMap.put(520, "Pict Info");
        hashMap.put(521, "Camera ID");
        hashMap.put(526, "Sequential Shot");
        hashMap.put(527, "Wide Range");
        hashMap.put(528, "Color Adjustment Node");
        hashMap.put(531, "Quick Shot");
        hashMap.put(532, "Self Timer");
        hashMap.put(534, "Voice Memo");
        hashMap.put(535, "Record Shutter Release");
        hashMap.put(536, "Flicker Reduce");
        hashMap.put(537, "Optical Zoom On");
        hashMap.put(539, "Digital Zoom On");
        hashMap.put(541, "Light Source Special");
        hashMap.put(542, "Resaved");
        hashMap.put(543, "Scene Select");
        hashMap.put(547, "Manual Focus Distance or Face Info");
        hashMap.put(548, "Sequence Shot Interval");
        hashMap.put(549, "Flash Mode");
        hashMap.put(3584, "Print IM");
        hashMap.put(3840, "Data Dump");
    }

    public z0() {
        E(new y0(this));
    }

    @Override // cc.b
    public String n() {
        return "Sanyo Makernote";
    }

    @Override // cc.b
    protected HashMap<Integer, String> w() {
        return f30353e;
    }
}