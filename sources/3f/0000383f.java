package com.google.crypto.tink.shaded.protobuf;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f16337a;

        a(i iVar) {
            this.f16337a = iVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1.b
        public byte byteAt(int i11) {
            return this.f16337a.c(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.k1.b
        public int size() {
            return this.f16337a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface b {
        byte byteAt(int i11);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(i iVar) {
        return b(new a(iVar));
    }

    static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i11 = 0; i11 < bVar.size(); i11++) {
            byte byteAt = bVar.byteAt(i11);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb2.append((char) byteAt);
                            continue;
                        } else {
                            sb2.append(CoreConstants.ESCAPE_CHAR);
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(i.i(str));
    }
}