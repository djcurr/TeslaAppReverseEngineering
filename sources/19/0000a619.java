package org.webrtc;

/* loaded from: classes4.dex */
public class StatsReport {

    /* renamed from: id  reason: collision with root package name */
    public final String f43893id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    /* loaded from: classes4.dex */
    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            return "[" + this.name + ": " + this.value + "]";
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d11, Value[] valueArr) {
        this.f43893id = str;
        this.type = str2;
        this.timestamp = d11;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id: ");
        sb2.append(this.f43893id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i11 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i11 < valueArr.length) {
                sb2.append(valueArr[i11].toString());
                sb2.append(", ");
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }
}