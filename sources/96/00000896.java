package androidx.room;

/* loaded from: classes.dex */
public class u0 {
    public static String a(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}