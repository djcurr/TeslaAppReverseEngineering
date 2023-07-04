package okhttp3.internal.http2;

import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Kind;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okio.e0;
import okio.f;
import okio.h;
import okio.i;
import okio.r;
import wz.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "", "Lokio/i;", "", "nameToFirstIndex", "name", "checkLowercase", "PREFIX_4_BITS", "I", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "NAME_TO_FIRST_INDEX", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<i, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        i iVar = Header.TARGET_METHOD;
        i iVar2 = Header.TARGET_PATH;
        i iVar3 = Header.TARGET_SCHEME;
        i iVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(iVar, "GET"), new Header(iVar, "POST"), new Header(iVar2, "/"), new Header(iVar2, "/index.html"), new Header(iVar3, "http"), new Header(iVar3, "https"), new Header(iVar4, "200"), new Header(iVar4, "204"), new Header(iVar4, "206"), new Header(iVar4, "304"), new Header(iVar4, "400"), new Header(iVar4, "404"), new Header(iVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header(PermissionsResponse.EXPIRES_KEY, ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(Kind.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<i, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i11].name)) {
                linkedHashMap.put(headerArr2[i11].name, Integer.valueOf(i11));
            }
        }
        Map<i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        s.f(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final i checkLowercase(i name) {
        s.g(name, "name");
        int z11 = name.z();
        for (int i11 = 0; i11 < z11; i11++) {
            byte b11 = (byte) 65;
            byte b12 = (byte) 90;
            byte g11 = name.g(i11);
            if (b11 <= g11 && b12 >= g11) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.F());
            }
        }
        return name;
    }

    public final Map<i, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010$\u001a\u00020.\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010*¨\u00061"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "Lvz/b0;", "adjustDynamicTableByteCount", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "index", "readIndexedHeader", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lokio/i;", "getName", "", "isStaticHeader", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "readByte", "", "getAndResetHeaderList", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "readByteString", "", "headerList", "Ljava/util/List;", "Lokio/h;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lokio/h;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "I", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "Lokio/e0;", "<init>", "(Lokio/e0;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final h source;

        public Reader(e0 e0Var, int i11) {
            this(e0Var, i11, 0, 4, null);
        }

        public Reader(e0 source, int i11, int i12) {
            s.g(source, "source");
            this.headerTableSizeSetting = i11;
            this.maxDynamicTableByteCount = i12;
            this.headerList = new ArrayList();
            this.source = r.d(source);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        private final void adjustDynamicTableByteCount() {
            int i11 = this.maxDynamicTableByteCount;
            int i12 = this.dynamicTableByteCount;
            if (i11 < i12) {
                if (i11 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i12 - i11);
                }
            }
        }

        private final void clearDynamicTable() {
            o.v(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i11) {
            return this.nextHeaderIndex + 1 + i11;
        }

        private final int evictToRecoverBytes(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i12 = this.nextHeaderIndex;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    s.e(header);
                    int i14 = header.hpackSize;
                    i11 -= i14;
                    this.dynamicTableByteCount -= i14;
                    this.headerCount--;
                    i13++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i12 + 1, headerArr, i12 + 1 + i13, this.headerCount);
                this.nextHeaderIndex += i13;
            }
            return i13;
        }

        private final i getName(int i11) {
            if (isStaticHeader(i11)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i11].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i11 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    Header header = headerArr[dynamicTableIndex];
                    s.e(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        private final void insertIntoDynamicTable(int i11, Header header) {
            this.headerList.add(header);
            int i12 = header.hpackSize;
            if (i11 != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i11)];
                s.e(header2);
                i12 -= header2.hpackSize;
            }
            int i13 = this.maxDynamicTableByteCount;
            if (i12 > i13) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i12) - i13);
            if (i11 == -1) {
                int i14 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i14 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i15 = this.nextHeaderIndex;
                this.nextHeaderIndex = i15 - 1;
                this.dynamicTable[i15] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i11 + dynamicTableIndex(i11) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i12;
        }

        private final boolean isStaticHeader(int i11) {
            return i11 >= 0 && i11 <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i11) {
            if (isStaticHeader(i11)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i11]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i11 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    s.e(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i11 + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i11) {
            insertIntoDynamicTable(-1, new Header(getName(i11), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i11) {
            this.headerList.add(new Header(getName(i11), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> O0;
            O0 = wz.e0.O0(this.headerList);
            this.headerList.clear();
            return O0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final i readByteString() {
            int readByte = readByte();
            boolean z11 = (readByte & 128) == 128;
            long readInt = readInt(readByte, 127);
            if (z11) {
                f fVar = new f();
                Huffman.INSTANCE.decode(this.source, readInt, fVar);
                return fVar.j1();
            }
            return this.source.z0(readInt);
        }

        public final void readHeaders() {
            while (!this.source.N0()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                }
                if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                        adjustDynamicTableByteCount();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                } else if (and != 16 && and != 0) {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                } else {
                    readLiteralHeaderWithoutIndexingNewName();
                }
            }
        }

        public final int readInt(int i11, int i12) {
            int i13 = i11 & i12;
            if (i13 < i12) {
                return i13;
            }
            int i14 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i12 + (readByte << i14);
                }
                i12 += (readByte & 127) << i14;
                i14 += 7;
            }
        }

        public /* synthetic */ Reader(e0 e0Var, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(e0Var, i11, (i13 & 4) != 0 ? i11 : i12);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0019\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0016\u0010#\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "Lvz/b0;", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", "value", "prefixMask", "bits", "writeInt", "Lokio/i;", MessageExtension.FIELD_DATA, "writeByteString", "headerTableSizeSetting", "resizeHeaderTable", "smallestHeaderTableSizeSetting", "I", "", "emitDynamicTableSizeUpdate", "Z", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "useCompression", "Lokio/f;", "out", "Lokio/f;", "<init>", "(IZLokio/f;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final f out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i11, f fVar) {
            this(i11, false, fVar, 2, null);
        }

        public Writer(int i11, boolean z11, f out) {
            s.g(out, "out");
            this.headerTableSizeSetting = i11;
            this.useCompression = z11;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i11;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        public Writer(f fVar) {
            this(0, false, fVar, 3, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i11 = this.maxDynamicTableByteCount;
            int i12 = this.dynamicTableByteCount;
            if (i11 < i12) {
                if (i11 == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i12 - i11);
                }
            }
        }

        private final void clearDynamicTable() {
            o.v(this.dynamicTable, null, 0, 0, 6, null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i11) {
            int i12;
            int i13 = 0;
            if (i11 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i12 = this.nextHeaderIndex;
                    if (length < i12 || i11 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    s.e(header);
                    i11 -= header.hpackSize;
                    int i14 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    s.e(header2);
                    this.dynamicTableByteCount = i14 - header2.hpackSize;
                    this.headerCount--;
                    i13++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i12 + 1, headerArr, i12 + 1 + i13, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i15 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i15 + 1, i15 + 1 + i13, (Object) null);
                this.nextHeaderIndex += i13;
            }
            return i13;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i11 = header.hpackSize;
            int i12 = this.maxDynamicTableByteCount;
            if (i11 > i12) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i11) - i12);
            int i13 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i13 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i14 = this.nextHeaderIndex;
            this.nextHeaderIndex = i14 - 1;
            this.dynamicTable[i14] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i11;
        }

        public final void resizeHeaderTable(int i11) {
            this.headerTableSizeSetting = i11;
            int min = Math.min(i11, 16384);
            int i12 = this.maxDynamicTableByteCount;
            if (i12 == min) {
                return;
            }
            if (min < i12) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(i data) {
            s.g(data, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.z()) {
                    f fVar = new f();
                    huffman.encode(data, fVar);
                    i j12 = fVar.j1();
                    writeInt(j12.z(), 127, 128);
                    this.out.w1(j12);
                    return;
                }
            }
            writeInt(data.z(), 127, 0);
            this.out.w1(data);
        }

        public final void writeHeaders(List<Header> headerBlock) {
            int i11;
            int i12;
            s.g(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i13 = this.smallestHeaderTableSizeSetting;
                if (i13 < this.maxDynamicTableByteCount) {
                    writeInt(i13, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i14 = 0; i14 < size; i14++) {
                Header header = headerBlock.get(i14);
                i D = header.name.D();
                i iVar = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(D);
                if (num != null) {
                    i12 = num.intValue() + 1;
                    if (2 <= i12 && 7 >= i12) {
                        if (s.c(hpack.getSTATIC_HEADER_TABLE()[i12 - 1].value, iVar)) {
                            i11 = i12;
                        } else if (s.c(hpack.getSTATIC_HEADER_TABLE()[i12].value, iVar)) {
                            i12++;
                            i11 = i12;
                        }
                    }
                    i11 = i12;
                    i12 = -1;
                } else {
                    i11 = -1;
                    i12 = -1;
                }
                if (i12 == -1) {
                    int i15 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i15 >= length) {
                            break;
                        }
                        Header header2 = this.dynamicTable[i15];
                        s.e(header2);
                        if (s.c(header2.name, D)) {
                            Header header3 = this.dynamicTable[i15];
                            s.e(header3);
                            if (s.c(header3.value, iVar)) {
                                i12 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i15 - this.nextHeaderIndex);
                                break;
                            } else if (i11 == -1) {
                                i11 = (i15 - this.nextHeaderIndex) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i15++;
                    }
                }
                if (i12 != -1) {
                    writeInt(i12, 127, 128);
                } else if (i11 == -1) {
                    this.out.O0(64);
                    writeByteString(D);
                    writeByteString(iVar);
                    insertIntoDynamicTable(header);
                } else if (D.A(Header.PSEUDO_PREFIX) && (!s.c(Header.TARGET_AUTHORITY, D))) {
                    writeInt(i11, 15, 0);
                    writeByteString(iVar);
                } else {
                    writeInt(i11, 63, 64);
                    writeByteString(iVar);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int i11, int i12, int i13) {
            if (i11 < i12) {
                this.out.O0(i11 | i13);
                return;
            }
            this.out.O0(i13 | i12);
            int i14 = i11 - i12;
            while (i14 >= 128) {
                this.out.O0(128 | (i14 & 127));
                i14 >>>= 7;
            }
            this.out.O0(i14);
        }

        public /* synthetic */ Writer(int i11, boolean z11, f fVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 4096 : i11, (i12 & 2) != 0 ? true : z11, fVar);
        }
    }
}