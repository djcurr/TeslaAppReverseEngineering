package com.google.android.gms.common.server.response;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', CoreConstants.DOUBLE_QUOTE_CHAR};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', CoreConstants.DOUBLE_QUOTE_CHAR};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th2) {
            super("Error instantiating inner object", th2);
        }

        public ParseException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, char[] r11) {
        /*
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L68
            r4 = r0
        L12:
            if (r4 >= r3) goto L60
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L31
            if (r11 == 0) goto L29
            r6 = r0
        L1f:
            if (r6 > 0) goto L29
            char r7 = r11[r6]
            if (r7 != r5) goto L26
            goto L31
        L26:
            int r6 = r6 + 1
            goto L1f
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L31:
            r6 = 34
            r7 = 1
            if (r5 != r6) goto L53
            if (r2 != 0) goto L5c
            r10.append(r9, r0, r4)
            r8.reset()
            int r4 = r4 + r7
            long r2 = (long) r4
            r8.skip(r2)
            if (r1 == 0) goto L4e
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L4e:
            java.lang.String r8 = r10.toString()
            return r8
        L53:
            r6 = 92
            if (r5 != r6) goto L5c
            r1 = r2 ^ 1
            r2 = r1
            r1 = r7
            goto L5d
        L5c:
            r2 = r0
        L5d:
            int r4 = r4 + 1
            goto L12
        L60:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L68:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zaA(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final char zai(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zao) != -1) {
            while (Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                    return (char) 0;
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        return zam2 == 0 ? BitmapDescriptorFactory.HUE_RED : Float.parseFloat(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) {
        int i11;
        int i12;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c11 = cArr[0];
            int i13 = c11 == '-' ? Integer.MIN_VALUE : -2147483647;
            int i14 = c11 == '-' ? 1 : 0;
            if (i14 < zam2) {
                i12 = i14 + 1;
                int digit = Character.digit(cArr[i14], 10);
                if (digit < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                i11 = -digit;
            } else {
                i11 = 0;
                i12 = i14;
            }
            while (i12 < zam2) {
                int i15 = i12 + 1;
                int digit2 = Character.digit(cArr[i12], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if (i11 < -214748364) {
                    throw new ParseException("Number too large");
                }
                int i16 = i11 * 10;
                if (i16 < i13 + digit2) {
                    throw new ParseException("Number too large");
                }
                i11 = i16 - digit2;
                i12 = i15;
            }
            if (i14 != 0) {
                if (i12 > 1) {
                    return i11;
                }
                throw new ParseException("No digits to parse");
            }
            return -i11;
        }
        throw new ParseException("No number to parse");
    }

    private final int zam(BufferedReader bufferedReader, char[] cArr) {
        int i11;
        char zai2 = zai(bufferedReader);
        if (zai2 != 0) {
            if (zai2 != ',') {
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return 0;
                }
                bufferedReader.mark(1024);
                if (zai2 == '\"') {
                    i11 = 0;
                    boolean z11 = false;
                    while (i11 < 1024 && bufferedReader.read(cArr, i11, 1) != -1) {
                        char c11 = cArr[i11];
                        if (Character.isISOControl(c11)) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                        if (c11 == '\"') {
                            if (!z11) {
                                bufferedReader.reset();
                                bufferedReader.skip(i11 + 1);
                                return i11;
                            }
                        } else if (c11 == '\\') {
                            z11 = !z11;
                            i11++;
                        }
                        z11 = false;
                        i11++;
                    }
                } else {
                    cArr[0] = zai2;
                    i11 = 1;
                    while (i11 < 1024 && bufferedReader.read(cArr, i11, 1) != -1) {
                        char c12 = cArr[i11];
                        if (c12 == '}' || c12 == ',' || Character.isWhitespace(c12) || cArr[i11] == ']') {
                            bufferedReader.reset();
                            bufferedReader.skip(i11 - 1);
                            cArr[i11] = 0;
                            return i11;
                        }
                        i11++;
                    }
                }
                if (i11 == 1024) {
                    throw new ParseException("Absurdly long value");
                }
                throw new ParseException("Unexpected EOF");
            }
            throw new ParseException("Missing value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) {
        long j11;
        int i11;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 > 0) {
            char c11 = cArr[0];
            long j12 = c11 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
            int i12 = c11 == '-' ? 1 : 0;
            if (i12 < zam2) {
                i11 = i12 + 1;
                int digit = Character.digit(cArr[i12], 10);
                if (digit < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                j11 = -digit;
            } else {
                j11 = 0;
                i11 = i12;
            }
            while (i11 < zam2) {
                int i13 = i11 + 1;
                int digit2 = Character.digit(cArr[i11], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                }
                if (j11 < -922337203685477580L) {
                    throw new ParseException("Number too large");
                }
                long j13 = j11 * 10;
                int i14 = zam2;
                long j14 = digit2;
                if (j13 < j12 + j14) {
                    throw new ParseException("Number too large");
                }
                j11 = j13 - j14;
                zam2 = i14;
                i11 = i13;
            }
            if (i12 != 0) {
                if (i11 > 1) {
                    return j11;
                }
                throw new ParseException("No digits to parse");
            }
            return -j11;
        }
        throw new ParseException("No number to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, char[] cArr2) {
        char zai2 = zai(bufferedReader);
        if (zai2 != '\"') {
            if (zai2 == 'n') {
                zax(bufferedReader, zaa);
                return null;
            }
            throw new ParseException("Expected string");
        }
        return zaA(bufferedReader, cArr, sb2, cArr2);
    }

    private final String zaq(BufferedReader bufferedReader) {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        } else if (zai2 == '}') {
            zaw(2);
            return null;
        } else {
            throw new ParseException("Unexpected token: " + zai2);
        }
    }

    private final String zar(BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i11 = 1;
        if (zai2 == '\"') {
            if (bufferedReader.read(this.zao) != -1) {
                char c11 = this.zao[0];
                boolean z11 = false;
                do {
                    if (c11 == '\"') {
                        if (z11) {
                            c11 = '\"';
                            z11 = true;
                        }
                    }
                    z11 = c11 == '\\' ? !z11 : false;
                    if (bufferedReader.read(this.zao) != -1) {
                        c11 = this.zao[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                } while (!Character.isISOControl(c11));
                throw new ParseException("Unexpected control character while reading string");
            }
            throw new ParseException("Unexpected EOF while parsing string");
        } else if (zai2 == ',') {
            throw new ParseException("Missing value");
        } else {
            if (zai2 == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) == ']') {
                    zaw(5);
                } else {
                    bufferedReader.reset();
                    boolean z12 = false;
                    boolean z13 = false;
                    while (i11 > 0) {
                        char zai3 = zai(bufferedReader);
                        if (zai3 != 0) {
                            if (Character.isISOControl(zai3)) {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                            if (zai3 == '\"') {
                                if (!z13) {
                                    z12 = !z12;
                                }
                                zai3 = '\"';
                            }
                            if (zai3 == '[') {
                                if (!z12) {
                                    i11++;
                                }
                                zai3 = '[';
                            }
                            if (zai3 == ']' && !z12) {
                                i11--;
                            }
                            z13 = (zai3 == '\\' && z12) ? !z13 : false;
                        } else {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                    }
                    zaw(5);
                }
            } else if (zai2 != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char zai4 = zai(bufferedReader);
                if (zai4 == '}') {
                    zaw(1);
                } else if (zai4 == '\"') {
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    do {
                    } while (zar(bufferedReader) != null);
                    zaw(1);
                } else {
                    throw new ParseException("Unexpected token " + zai4);
                }
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        } else if (zai5 == '}') {
            zaw(2);
            return null;
        } else {
            throw new ParseException("Unexpected token " + zai5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, zam2));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        } else if (zai2 == '[') {
            this.zat.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char zai3 = zai(bufferedReader);
                if (zai3 == 0) {
                    throw new ParseException("Unexpected EOF");
                }
                if (zai3 != ',') {
                    if (zai3 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zaiVar.zaa(this, bufferedReader));
                    } else {
                        zaw(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) {
        ArrayList arrayList = new ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        } else if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        } else if (zai2 == '{') {
            this.zat.push(1);
            while (true) {
                try {
                    FastJsonResponse zad2 = field.zad();
                    if (!zaz(bufferedReader, zad2)) {
                        return arrayList;
                    }
                    arrayList.add(zad2);
                    char zai3 = zai(bufferedReader);
                    if (zai3 != ',') {
                        if (zai3 == ']') {
                            zaw(5);
                            return arrayList;
                        }
                        throw new ParseException("Unexpected token: " + zai3);
                    } else if (zai(bufferedReader) == '{') {
                        this.zat.push(1);
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (IllegalAccessException e11) {
                    throw new ParseException("Error instantiating inner object", e11);
                } catch (InstantiationException e12) {
                    throw new ParseException("Error instantiating inner object", e12);
                }
            }
        } else {
            throw new ParseException("Unexpected token: " + zai2);
        }
    }

    private final void zaw(int i11) {
        if (!this.zat.isEmpty()) {
            int intValue = ((Integer) this.zat.pop()).intValue();
            if (intValue == i11) {
                return;
            }
            throw new ParseException("Expected state " + i11 + " but had " + intValue);
        }
        throw new ParseException("Expected state " + i11 + " but had empty stack");
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) {
        int i11 = 0;
        while (true) {
            int length = cArr.length;
            if (i11 >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i11);
            if (read == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i12 = 0; i12 < read; i12++) {
                if (cArr[i12 + i11] != this.zap[i12]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i11 += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z11) {
        char[] cArr;
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            if (!z11) {
                return zay(bufferedReader, true);
            }
            throw new ParseException("No boolean value found in string");
        } else if (zai2 == 'f') {
            if (z11) {
                cArr = zae;
            } else {
                cArr = zad;
            }
            zax(bufferedReader, cArr);
            return false;
        } else if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return false;
        } else if (zai2 == 't') {
            zax(bufferedReader, z11 ? zac : zab);
            return true;
        } else {
            throw new ParseException("Unexpected token: " + zai2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) {
        int i11;
        HashMap hashMap;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String zaq = zaq(bufferedReader);
        if (zaq != null) {
            while (zaq != null) {
                FastJsonResponse.Field<?, ?> field = fieldMappings.get(zaq);
                if (field == null) {
                    zaq = zar(bufferedReader);
                } else {
                    this.zat.push(4);
                    int i12 = field.zaa;
                    switch (i12) {
                        case 0:
                            if (field.zab) {
                                fastJsonResponse.zav(field, zau(bufferedReader, zag));
                            } else {
                                fastJsonResponse.zau(field, zal(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 1:
                            if (field.zab) {
                                fastJsonResponse.zag(field, zau(bufferedReader, zam));
                            } else {
                                fastJsonResponse.zae(field, zat(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 2:
                            if (field.zab) {
                                fastJsonResponse.zay(field, zau(bufferedReader, zah));
                            } else {
                                fastJsonResponse.zax(field, zan(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 3:
                            if (field.zab) {
                                fastJsonResponse.zas(field, zau(bufferedReader, zai));
                            } else {
                                fastJsonResponse.zaq(field, zak(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 4:
                            if (field.zab) {
                                fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                            } else {
                                fastJsonResponse.zam(field, zaj(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 5:
                            if (field.zab) {
                                fastJsonResponse.zac(field, zau(bufferedReader, zan));
                            } else {
                                fastJsonResponse.zaa(field, zas(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 6:
                            if (field.zab) {
                                fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                            } else {
                                fastJsonResponse.zai(field, zay(bufferedReader, false));
                            }
                            i11 = 4;
                            break;
                        case 7:
                            if (field.zab) {
                                fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                            } else {
                                fastJsonResponse.zaA(field, zao(bufferedReader));
                            }
                            i11 = 4;
                            break;
                        case 8:
                            fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                            i11 = 4;
                            break;
                        case 9:
                            fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                            i11 = 4;
                            break;
                        case 10:
                            char zai2 = zai(bufferedReader);
                            if (zai2 == 'n') {
                                zax(bufferedReader, zaa);
                                hashMap = null;
                            } else if (zai2 == '{') {
                                this.zat.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char zai3 = zai(bufferedReader);
                                    if (zai3 != 0) {
                                        if (zai3 == '\"') {
                                            String zaA = zaA(bufferedReader, this.zap, this.zar, null);
                                            if (zai(bufferedReader) == ':') {
                                                if (zai(bufferedReader) == '\"') {
                                                    hashMap.put(zaA, zaA(bufferedReader, this.zap, this.zar, null));
                                                    char zai4 = zai(bufferedReader);
                                                    if (zai4 != ',') {
                                                        if (zai4 == '}') {
                                                            zaw(1);
                                                        } else {
                                                            throw new ParseException("Unexpected character while parsing string map: " + zai4);
                                                        }
                                                    }
                                                } else {
                                                    throw new ParseException("Expected String value for key ".concat(String.valueOf(zaA)));
                                                }
                                            } else {
                                                throw new ParseException("No map value found for key ".concat(String.valueOf(zaA)));
                                            }
                                        } else if (zai3 == '}') {
                                            zaw(1);
                                        }
                                        i11 = 4;
                                        break;
                                    } else {
                                        throw new ParseException("Unexpected EOF");
                                    }
                                }
                            } else {
                                throw new ParseException("Expected start of a map object");
                            }
                            fastJsonResponse.zaB(field, hashMap);
                            i11 = 4;
                        case 11:
                            if (field.zab) {
                                char zai5 = zai(bufferedReader);
                                if (zai5 == 'n') {
                                    zax(bufferedReader, zaa);
                                    fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                                } else {
                                    this.zat.push(5);
                                    if (zai5 == '[') {
                                        fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                                    } else {
                                        throw new ParseException("Expected array start");
                                    }
                                }
                            } else {
                                char zai6 = zai(bufferedReader);
                                if (zai6 == 'n') {
                                    zax(bufferedReader, zaa);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                                } else {
                                    this.zat.push(1);
                                    if (zai6 == '{') {
                                        try {
                                            FastJsonResponse zad2 = field.zad();
                                            zaz(bufferedReader, zad2);
                                            fastJsonResponse.addConcreteTypeInternal(field, field.zae, zad2);
                                        } catch (IllegalAccessException e11) {
                                            throw new ParseException("Error instantiating inner object", e11);
                                        } catch (InstantiationException e12) {
                                            throw new ParseException("Error instantiating inner object", e12);
                                        }
                                    } else {
                                        throw new ParseException("Expected start of object");
                                    }
                                }
                            }
                            i11 = 4;
                            break;
                        default:
                            throw new ParseException("Invalid field type " + i12);
                    }
                    zaw(i11);
                    zaw(2);
                    char zai7 = zai(bufferedReader);
                    if (zai7 == ',') {
                        zaq = zaq(bufferedReader);
                    } else if (zai7 != '}') {
                        throw new ParseException("Expected end of object or field separator, but found: " + zai7);
                    } else {
                        zaq = null;
                    }
                }
            }
            zaw(1);
            return true;
        }
        zaw(1);
        return false;
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t11) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 != 0) {
                    if (zai2 == '[') {
                        this.zat.push(5);
                        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t11.getFieldMappings();
                        if (fieldMappings.size() == 1) {
                            FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                            t11.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                        } else {
                            throw new ParseException("Object array response class must have a single Field");
                        }
                    } else if (zai2 == '{') {
                        this.zat.push(1);
                        zaz(bufferedReader, t11);
                    } else {
                        throw new ParseException("Unexpected token: " + zai2);
                    }
                    zaw(0);
                    try {
                        bufferedReader.close();
                        return;
                    } catch (IOException unused) {
                        Log.w("FastParser", "Failed to close reader while parsing.");
                        return;
                    }
                }
                throw new ParseException("No data to parse");
            } catch (IOException e11) {
                throw new ParseException(e11);
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th2;
        }
    }
}