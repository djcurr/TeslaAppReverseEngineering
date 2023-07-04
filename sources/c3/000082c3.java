package l6;

import ch.qos.logback.core.CoreConstants;
import com.adobe.xmp.XMPException;
import expo.modules.imagepicker.ImagePickerConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes.dex */
public final class p implements k6.e {

    /* renamed from: a  reason: collision with root package name */
    private Map f37049a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map f37050b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map f37051c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Pattern f37052d = Pattern.compile("[/*?\\[\\]]");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements o6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f37053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37055c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n6.a f37056d;

        a(p pVar, String str, String str2, String str3, n6.a aVar) {
            this.f37053a = str;
            this.f37054b = str2;
            this.f37055c = str3;
            this.f37056d = aVar;
        }

        @Override // o6.a
        public String a() {
            return this.f37053a;
        }

        @Override // o6.a
        public String b() {
            return this.f37054b;
        }

        @Override // o6.a
        public String c() {
            return this.f37055c;
        }

        @Override // o6.a
        public n6.a d() {
            return this.f37056d;
        }

        public String toString() {
            return this.f37054b + this.f37055c + " NS(" + this.f37053a + "), FORM (" + d() + ")";
        }
    }

    public p() {
        try {
            g();
            f();
        } catch (XMPException unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    private void f() {
        n6.a l11 = new n6.a().l(true);
        n6.a k11 = new n6.a().k(true);
        e("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
        e("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", null);
        e("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
        e("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        e("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
        e("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", MessageBundle.TITLE_ENTRY, null);
        e("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        e("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
        e("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        e("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", k11);
        e("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", MessageBundle.TITLE_ENTRY, k11);
        e("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", k11);
        e("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", k11);
        e("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        e("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
        e("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", MessageBundle.TITLE_ENTRY, k11);
        e("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
        e("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", null);
        e("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", null);
        e("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l11);
        e("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", k11);
        e("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        e("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", k11);
        e("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", MessageBundle.TITLE_ENTRY, k11);
    }

    private void g() {
        b("http://www.w3.org/XML/1998/namespace", "xml");
        b("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        b("http://purl.org/dc/elements/1.1/", "dc");
        b("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        b("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
        b("http://ns.adobe.com/DICOM/", "DICOM");
        b("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
        b("adobe:ns:meta/", "x");
        b("http://ns.adobe.com/iX/1.0/", "iX");
        b("http://ns.adobe.com/xap/1.0/", "xmp");
        b("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        b("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        b("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        b("http://ns.adobe.com/xmp/note/", "xmpNote");
        b("http://ns.adobe.com/pdf/1.3/", "pdf");
        b("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        b("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        b("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        b("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        b("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        b("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        b("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        b("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        b("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        b("http://ns.adobe.com/album/1.0/", "album");
        b("http://ns.adobe.com/exif/1.0/", ImagePickerConstants.OPTION_EXIF);
        b("http://cipa.jp/exif/1.0/", "exifEX");
        b("http://ns.adobe.com/exif/1.0/aux/", "aux");
        b("http://ns.adobe.com/tiff/1.0/", "tiff");
        b("http://ns.adobe.com/png/1.0/", "png");
        b("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        b("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        b("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        b("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        b("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        b("http://ns.adobe.com/asf/1.0/", "asf");
        b("http://ns.adobe.com/xmp/wav/1.0/", "wav");
        b("http://ns.adobe.com/bwf/bext/1.0/", "bext");
        b("http://ns.adobe.com/riff/info/", "riffinfo");
        b("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
        b("http://ns.adobe.com/TransformXMP/", "txmp");
        b("http://ns.adobe.com/swf/1.0/", "swf");
        b("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        b("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        b("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        b("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        b("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        b("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        b("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
        b("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        b("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        b("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        b("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        b("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }

    @Override // k6.e
    public synchronized String a(String str) {
        return (String) this.f37049a.get(str);
    }

    @Override // k6.e
    public synchronized String b(String str, String str2) {
        e.e(str);
        e.c(str2);
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2 + CoreConstants.COLON_CHAR;
        }
        if (h.g(str2.substring(0, str2.length() - 1))) {
            String str3 = (String) this.f37049a.get(str);
            String str4 = (String) this.f37050b.get(str2);
            if (str3 != null) {
                return str3;
            }
            if (str4 != null) {
                String str5 = str2;
                int i11 = 1;
                while (this.f37050b.containsKey(str5)) {
                    str5 = str2.substring(0, str2.length() - 1) + "_" + i11 + "_:";
                    i11++;
                }
                str2 = str5;
            }
            this.f37050b.put(str2, str);
            this.f37049a.put(str, str2);
            return str2;
        }
        throw new XMPException("The prefix is a bad XML name", 201);
    }

    @Override // k6.e
    public synchronized String c(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str + ":";
            }
        }
        return (String) this.f37050b.get(str);
    }

    @Override // k6.e
    public synchronized o6.a d(String str) {
        return (o6.a) this.f37051c.get(str);
    }

    synchronized void e(String str, String str2, String str3, String str4, n6.a aVar) {
        e.e(str);
        e.d(str2);
        e.e(str3);
        e.d(str4);
        n6.a aVar2 = aVar != null ? new n6.a(n.p(aVar.m(), null).d()) : new n6.a();
        if (this.f37052d.matcher(str2).find() || this.f37052d.matcher(str4).find()) {
            throw new XMPException("Alias and actual property names must be simple", 102);
        }
        String a11 = a(str);
        String a12 = a(str3);
        if (a11 == null) {
            throw new XMPException("Alias namespace is not registered", 101);
        }
        if (a12 == null) {
            throw new XMPException("Actual namespace is not registered", 101);
        }
        String str5 = a11 + str2;
        if (this.f37051c.containsKey(str5)) {
            throw new XMPException("Alias is already existing", 4);
        }
        if (this.f37051c.containsKey(a12 + str4)) {
            throw new XMPException("Actual property is already an alias, use the base property", 4);
        }
        this.f37051c.put(str5, new a(this, str3, a12, str4, aVar2));
    }
}