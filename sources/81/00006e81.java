package fp;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f26708a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object[][] f26709b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object[][] f26710c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object[][] f26711d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object[][] f26712e;

    static {
        Object obj = new Object();
        f26708a = obj;
        f26709b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        f26710c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f26711d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        f26712e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        Object[][] objArr;
        Object[][] objArr2;
        Object[][] objArr3;
        Object[][] objArr4;
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            for (Object[] objArr5 : f26709b) {
                if (objArr5[0].equals(substring)) {
                    if (objArr5[1] == f26708a) {
                        return c(2, ((Integer) objArr5[2]).intValue(), str);
                    }
                    return b(2, ((Integer) objArr5[1]).intValue(), str);
                }
            }
            if (str.length() >= 3) {
                String substring2 = str.substring(0, 3);
                for (Object[] objArr6 : f26710c) {
                    if (objArr6[0].equals(substring2)) {
                        if (objArr6[1] == f26708a) {
                            return c(3, ((Integer) objArr6[2]).intValue(), str);
                        }
                        return b(3, ((Integer) objArr6[1]).intValue(), str);
                    }
                }
                for (Object[] objArr7 : f26711d) {
                    if (objArr7[0].equals(substring2)) {
                        if (objArr7[1] == f26708a) {
                            return c(4, ((Integer) objArr7[2]).intValue(), str);
                        }
                        return b(4, ((Integer) objArr7[1]).intValue(), str);
                    }
                }
                if (str.length() >= 4) {
                    String substring3 = str.substring(0, 4);
                    for (Object[] objArr8 : f26712e) {
                        if (objArr8[0].equals(substring3)) {
                            if (objArr8[1] == f26708a) {
                                return c(4, ((Integer) objArr8[2]).intValue(), str);
                            }
                            return b(4, ((Integer) objArr8[1]).intValue(), str);
                        }
                    }
                    throw NotFoundException.a();
                }
                throw NotFoundException.a();
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static String b(int i11, int i12, String str) {
        if (str.length() >= i11) {
            String substring = str.substring(0, i11);
            int i13 = i12 + i11;
            if (str.length() >= i13) {
                String substring2 = str.substring(i11, i13);
                String str2 = "(" + substring + CoreConstants.RIGHT_PARENTHESIS_CHAR + substring2;
                String a11 = a(str.substring(i13));
                if (a11 == null) {
                    return str2;
                }
                return str2 + a11;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static String c(int i11, int i12, String str) {
        String substring = str.substring(0, i11);
        int i13 = i12 + i11;
        if (str.length() < i13) {
            i13 = str.length();
        }
        String substring2 = str.substring(i11, i13);
        String str2 = "(" + substring + CoreConstants.RIGHT_PARENTHESIS_CHAR + substring2;
        String a11 = a(str.substring(i13));
        if (a11 == null) {
            return str2;
        }
        return str2 + a11;
    }
}