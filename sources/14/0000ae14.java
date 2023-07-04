package qi;

import ak.v;
import ci.i;
import com.stripe.android.core.networking.RequestHeadersFactory;
import wi.a;

/* loaded from: classes3.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    static final String[] f48249a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static bj.e a(int i11, v vVar) {
        int m11 = vVar.m();
        if (vVar.m() == 1684108385) {
            vVar.P(8);
            String x11 = vVar.x(m11 - 16);
            return new bj.e(RequestHeadersFactory.UNDETERMINED_LANGUAGE, x11, x11);
        }
        String valueOf = String.valueOf(a.a(i11));
        ak.o.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    private static bj.a b(v vVar) {
        int m11 = vVar.m();
        if (vVar.m() == 1684108385) {
            int b11 = a.b(vVar.m());
            String str = b11 == 13 ? "image/jpeg" : b11 == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Unrecognized cover art flags: ");
                sb2.append(b11);
                ak.o.h("MetadataUtil", sb2.toString());
                return null;
            }
            vVar.P(4);
            int i11 = m11 - 16;
            byte[] bArr = new byte[i11];
            vVar.j(bArr, 0, i11);
            return new bj.a(str, null, 3, bArr);
        }
        ak.o.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static a.b c(v vVar) {
        int e11 = vVar.e() + vVar.m();
        int m11 = vVar.m();
        int i11 = (m11 >> 24) & 255;
        try {
            if (i11 == 169 || i11 == 253) {
                int i12 = 16777215 & m11;
                if (i12 == 6516084) {
                    return a(m11, vVar);
                }
                if (i12 == 7233901 || i12 == 7631467) {
                    return h(m11, "TIT2", vVar);
                }
                if (i12 == 6516589 || i12 == 7828084) {
                    return h(m11, "TCOM", vVar);
                }
                if (i12 == 6578553) {
                    return h(m11, "TDRC", vVar);
                }
                if (i12 == 4280916) {
                    return h(m11, "TPE1", vVar);
                }
                if (i12 == 7630703) {
                    return h(m11, "TSSE", vVar);
                }
                if (i12 == 6384738) {
                    return h(m11, "TALB", vVar);
                }
                if (i12 == 7108978) {
                    return h(m11, "USLT", vVar);
                }
                if (i12 == 6776174) {
                    return h(m11, "TCON", vVar);
                }
                if (i12 == 6779504) {
                    return h(m11, "TIT1", vVar);
                }
            } else if (m11 == 1735291493) {
                return g(vVar);
            } else {
                if (m11 == 1684632427) {
                    return d(m11, "TPOS", vVar);
                }
                if (m11 == 1953655662) {
                    return d(m11, "TRCK", vVar);
                }
                if (m11 == 1953329263) {
                    return i(m11, "TBPM", vVar, true, false);
                }
                if (m11 == 1668311404) {
                    return i(m11, "TCMP", vVar, true, true);
                }
                if (m11 == 1668249202) {
                    return b(vVar);
                }
                if (m11 == 1631670868) {
                    return h(m11, "TPE2", vVar);
                }
                if (m11 == 1936682605) {
                    return h(m11, "TSOT", vVar);
                }
                if (m11 == 1936679276) {
                    return h(m11, "TSO2", vVar);
                }
                if (m11 == 1936679282) {
                    return h(m11, "TSOA", vVar);
                }
                if (m11 == 1936679265) {
                    return h(m11, "TSOP", vVar);
                }
                if (m11 == 1936679791) {
                    return h(m11, "TSOC", vVar);
                }
                if (m11 == 1920233063) {
                    return i(m11, "ITUNESADVISORY", vVar, false, false);
                }
                if (m11 == 1885823344) {
                    return i(m11, "ITUNESGAPLESS", vVar, false, true);
                }
                if (m11 == 1936683886) {
                    return h(m11, "TVSHOWSORT", vVar);
                }
                if (m11 == 1953919848) {
                    return h(m11, "TVSHOW", vVar);
                }
                if (m11 == 757935405) {
                    return e(vVar, e11);
                }
            }
            String valueOf = String.valueOf(a.a(m11));
            ak.o.b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            vVar.O(e11);
        }
    }

    private static bj.m d(int i11, String str, v vVar) {
        int m11 = vVar.m();
        if (vVar.m() == 1684108385 && m11 >= 22) {
            vVar.P(10);
            int I = vVar.I();
            if (I > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(I);
                String sb3 = sb2.toString();
                int I2 = vVar.I();
                if (I2 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(I2);
                    sb3 = sb4.toString();
                }
                return new bj.m(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(a.a(i11));
        ak.o.h("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    private static bj.i e(v vVar, int i11) {
        int i12 = -1;
        int i13 = -1;
        String str = null;
        String str2 = null;
        while (vVar.e() < i11) {
            int e11 = vVar.e();
            int m11 = vVar.m();
            int m12 = vVar.m();
            vVar.P(4);
            if (m12 == 1835360622) {
                str = vVar.x(m11 - 12);
            } else if (m12 == 1851878757) {
                str2 = vVar.x(m11 - 12);
            } else {
                if (m12 == 1684108385) {
                    i12 = e11;
                    i13 = m11;
                }
                vVar.P(m11 - 12);
            }
        }
        if (str == null || str2 == null || i12 == -1) {
            return null;
        }
        vVar.O(i12);
        vVar.P(16);
        return new bj.j(str, str2, vVar.x(i13 - 16));
    }

    public static cj.a f(v vVar, int i11, String str) {
        while (true) {
            int e11 = vVar.e();
            if (e11 >= i11) {
                return null;
            }
            int m11 = vVar.m();
            if (vVar.m() == 1684108385) {
                int m12 = vVar.m();
                int m13 = vVar.m();
                int i12 = m11 - 16;
                byte[] bArr = new byte[i12];
                vVar.j(bArr, 0, i12);
                return new cj.a(str, bArr, m13, m12);
            }
            vVar.O(e11 + m11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static bj.m g(ak.v r3) {
        /*
            int r3 = j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = qi.h.f48249a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            bj.m r1 = new bj.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            ak.o.h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.h.g(ak.v):bj.m");
    }

    private static bj.m h(int i11, String str, v vVar) {
        int m11 = vVar.m();
        if (vVar.m() == 1684108385) {
            vVar.P(8);
            return new bj.m(str, null, vVar.x(m11 - 16));
        }
        String valueOf = String.valueOf(a.a(i11));
        ak.o.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static bj.i i(int i11, String str, v vVar, boolean z11, boolean z12) {
        int j11 = j(vVar);
        if (z12) {
            j11 = Math.min(1, j11);
        }
        if (j11 >= 0) {
            if (z11) {
                return new bj.m(str, null, Integer.toString(j11));
            }
            return new bj.e(RequestHeadersFactory.UNDETERMINED_LANGUAGE, str, Integer.toString(j11));
        }
        String valueOf = String.valueOf(a.a(i11));
        ak.o.h("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static int j(v vVar) {
        vVar.P(4);
        if (vVar.m() == 1684108385) {
            vVar.P(8);
            return vVar.C();
        }
        ak.o.h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i11, ji.r rVar, i.b bVar) {
        if (i11 == 1 && rVar.a()) {
            bVar.M(rVar.f33763a).N(rVar.f33764b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(int r5, wi.a r6, wi.a r7, ci.i.b r8, wi.a... r9) {
        /*
            wi.a r0 = new wi.a
            r1 = 0
            wi.a$b[] r2 = new wi.a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.d()
            if (r5 >= r6) goto L3c
            wi.a$b r6 = r7.c(r5)
            boolean r3 = r6 instanceof cj.a
            if (r3 == 0) goto L39
            cj.a r6 = (cj.a) r6
            java.lang.String r3 = r6.f9254a
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            wi.a r5 = new wi.a
            wi.a$b[] r7 = new wi.a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            wi.a r6 = r6.b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.d()
            if (r5 <= 0) goto L52
            r8.X(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.h.l(int, wi.a, wi.a, ci.i$b, wi.a[]):void");
    }
}