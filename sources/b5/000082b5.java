package l6;

import ch.qos.logback.core.CoreConstants;
import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public class f {
    private static m a(k kVar, m mVar, Node node, String str, boolean z11) {
        k6.e a11 = k6.d.a();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String a12 = a11.a(namespaceURI);
            if (a12 == null) {
                a12 = a11.b(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
            }
            String str2 = a12 + node.getLocalName();
            n6.e eVar = new n6.e();
            boolean z12 = false;
            if (z11) {
                mVar = n.i(kVar.a(), namespaceURI, "_dflt", true);
                mVar.U(false);
                if (a11.d(str2) != null) {
                    kVar.a().S(true);
                    mVar.S(true);
                    z12 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            m mVar2 = new m(str2, str, eVar);
            mVar2.Q(z12);
            if (equals2) {
                mVar.a(1, mVar2);
            } else {
                mVar.b(mVar2);
            }
            if (equals2) {
                if (z11 || !mVar.t().q()) {
                    throw new XMPException("Misplaced rdf:value element", 202);
                }
                mVar.T(true);
            }
            if (equals) {
                if (!mVar.t().i()) {
                    throw new XMPException("Misplaced rdf:li element", 202);
                }
                mVar2.V(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            return mVar2;
        }
        throw new XMPException("XML namespace required for all elements and attributes", 202);
    }

    private static m b(m mVar, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = h.h(str2);
        }
        m mVar2 = new m(str, str2, null);
        mVar.c(mVar2);
        return mVar2;
    }

    private static void c(m mVar) {
        m l11 = mVar.l(1);
        if (l11.t().h()) {
            if (mVar.t().h()) {
                throw new XMPException("Redundant xml:lang for rdf:value element", 203);
            }
            m w11 = l11.w(1);
            l11.N(w11);
            mVar.c(w11);
        }
        for (int i11 = 1; i11 <= l11.x(); i11++) {
            mVar.c(l11.w(i11));
        }
        for (int i12 = 2; i12 <= mVar.o(); i12++) {
            mVar.c(mVar.l(i12));
        }
        mVar.T(false);
        mVar.t().B(false);
        mVar.t().r(l11.t());
        mVar.Y(l11.z());
        mVar.M();
        Iterator H = l11.H();
        while (H.hasNext()) {
            mVar.b((m) H.next());
        }
    }

    private static int d(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if ("http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            if ("li".equals(localName)) {
                return 9;
            }
            if ("parseType".equals(localName)) {
                return 4;
            }
            if ("Description".equals(localName)) {
                return 8;
            }
            if ("about".equals(localName)) {
                return 3;
            }
            if ("resource".equals(localName)) {
                return 5;
            }
            if ("RDF".equals(localName)) {
                return 1;
            }
            if ("ID".equals(localName)) {
                return 2;
            }
            if ("nodeID".equals(localName)) {
                return 6;
            }
            if ("datatype".equals(localName)) {
                return 7;
            }
            if ("aboutEach".equals(localName)) {
                return 10;
            }
            if ("aboutEachPrefix".equals(localName)) {
                return 11;
            }
            return "bagID".equals(localName) ? 12 : 0;
        }
        return 0;
    }

    private static boolean e(int i11) {
        return 1 <= i11 && i11 <= 7;
    }

    private static boolean f(int i11) {
        return 10 <= i11 && i11 <= 12;
    }

    private static boolean g(int i11) {
        if (i11 == 8 || f(i11)) {
            return false;
        }
        return !e(i11);
    }

    private static boolean h(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i11 = 0; i11 < nodeValue.length(); i11++) {
            if (!Character.isWhitespace(nodeValue.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k i(Node node) {
        k kVar = new k();
        u(kVar, node);
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(l6.k r16, l6.m r17, org.w3c.dom.Node r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.j(l6.k, l6.m, org.w3c.dom.Node, boolean):void");
    }

    private static void k(k kVar, m mVar, Node node, boolean z11) {
        Node item;
        m a11 = a(kVar, mVar, node, null, z11);
        for (int i11 = 0; i11 < node.getAttributes().getLength(); i11++) {
            Node item2 = node.getAttributes().item(i11);
            if (!"xmlns".equals(item2.getPrefix()) && (item2.getPrefix() != null || !"xmlns".equals(item2.getNodeName()))) {
                String namespaceURI = item2.getNamespaceURI();
                String localName = item2.getLocalName();
                if ("xml:lang".equals(item2.getNodeName())) {
                    b(a11, "xml:lang", item2.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new XMPException("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        for (int i12 = 0; i12 < node.getChildNodes().getLength(); i12++) {
            if (node.getChildNodes().item(i12).getNodeType() != 3) {
                throw new XMPException("Invalid child of literal property element", 202);
            }
            str = str + item.getNodeValue();
        }
        a11.Y(str);
    }

    private static void l(k kVar, m mVar, Node node, boolean z11) {
        int d11 = d(node);
        if (d11 != 8 && d11 != 0) {
            throw new XMPException("Node element must be rdf:Description or typed node", 202);
        }
        if (z11 && d11 == 0) {
            throw new XMPException("Top level typed node not allowed", 203);
        }
        m(kVar, mVar, node, z11);
        t(kVar, mVar, node, z11);
    }

    private static void m(k kVar, m mVar, Node node, boolean z11) {
        int i11 = 0;
        for (int i12 = 0; i12 < node.getAttributes().getLength(); i12++) {
            Node item = node.getAttributes().item(i12);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                int d11 = d(item);
                if (d11 == 0) {
                    a(kVar, mVar, item, item.getNodeValue(), z11);
                } else if (d11 != 6 && d11 != 2 && d11 != 3) {
                    throw new XMPException("Invalid nodeElement attribute", 202);
                } else {
                    if (i11 > 0) {
                        throw new XMPException("Mutally exclusive about, ID, nodeID attributes", 202);
                    }
                    i11++;
                    if (z11 && d11 == 3) {
                        if (mVar.s() == null || mVar.s().length() <= 0) {
                            mVar.V(item.getNodeValue());
                        } else if (!mVar.s().equals(item.getNodeValue())) {
                            throw new XMPException("Mismatched top level rdf:about values", 203);
                        }
                    }
                }
            }
        }
    }

    private static void n(k kVar, m mVar, Node node) {
        for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
            Node item = node.getChildNodes().item(i11);
            if (!h(item)) {
                l(kVar, mVar, item, true);
            }
        }
    }

    private static void o() {
        throw new XMPException("ParseTypeCollection property element not allowed", 203);
    }

    private static void p() {
        throw new XMPException("ParseTypeLiteral property element not allowed", 203);
    }

    private static void q() {
        throw new XMPException("ParseTypeOther property element not allowed", 203);
    }

    private static void r(k kVar, m mVar, Node node, boolean z11) {
        m a11 = a(kVar, mVar, node, "", z11);
        a11.t().B(true);
        for (int i11 = 0; i11 < node.getAttributes().getLength(); i11++) {
            Node item = node.getAttributes().item(i11);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                if ("xml:lang".equals(item.getNodeName())) {
                    b(a11, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"parseType".equals(localName))) {
                    throw new XMPException("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        t(kVar, a11, node, false);
        if (a11.r()) {
            c(a11);
        }
    }

    private static void s(k kVar, m mVar, Node node, boolean z11) {
        if (!g(d(node))) {
            throw new XMPException("Invalid property element name", 202);
        }
        NamedNodeMap attributes = node.getAttributes();
        ArrayList<String> arrayList = null;
        for (int i11 = 0; i11 < attributes.getLength(); i11++) {
            Node item = attributes.item(i11);
            if ("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName()))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(item.getNodeName());
            }
        }
        if (arrayList != null) {
            for (String str : arrayList) {
                attributes.removeNamedItem(str);
            }
        }
        if (attributes.getLength() <= 3) {
            for (int i12 = 0; i12 < attributes.getLength(); i12++) {
                Node item2 = attributes.item(i12);
                String localName = item2.getLocalName();
                String namespaceURI = item2.getNamespaceURI();
                String nodeValue = item2.getNodeValue();
                if (!"xml:lang".equals(item2.getNodeName()) || ("ID".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                    if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        k(kVar, mVar, node, z11);
                        return;
                    } else if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        j(kVar, mVar, node, z11);
                        return;
                    } else if ("Literal".equals(nodeValue)) {
                        p();
                        return;
                    } else if ("Resource".equals(nodeValue)) {
                        r(kVar, mVar, node, z11);
                        return;
                    } else if ("Collection".equals(nodeValue)) {
                        o();
                        return;
                    } else {
                        q();
                        return;
                    }
                }
            }
            if (node.hasChildNodes()) {
                for (int i13 = 0; i13 < node.getChildNodes().getLength(); i13++) {
                    if (node.getChildNodes().item(i13).getNodeType() != 3) {
                        v(kVar, mVar, node, z11);
                        return;
                    }
                }
                k(kVar, mVar, node, z11);
                return;
            }
        }
        j(kVar, mVar, node, z11);
    }

    private static void t(k kVar, m mVar, Node node, boolean z11) {
        for (int i11 = 0; i11 < node.getChildNodes().getLength(); i11++) {
            Node item = node.getChildNodes().item(i11);
            if (!h(item)) {
                if (item.getNodeType() != 1) {
                    throw new XMPException("Expected property element node not found", 202);
                }
                s(kVar, mVar, item, z11);
            }
        }
    }

    static void u(k kVar, Node node) {
        if (!node.hasAttributes()) {
            throw new XMPException("Invalid attributes of rdf:RDF element", 202);
        }
        n(kVar, kVar.a(), node);
    }

    private static void v(k kVar, m mVar, Node node, boolean z11) {
        if (z11 && "iX:changes".equals(node.getNodeName())) {
            return;
        }
        m a11 = a(kVar, mVar, node, "", z11);
        for (int i11 = 0; i11 < node.getAttributes().getLength(); i11++) {
            Node item = node.getAttributes().item(i11);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                if ("xml:lang".equals(item.getNodeName())) {
                    b(a11, "xml:lang", item.getNodeValue());
                } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                    throw new XMPException("Invalid attribute for resource property element", 202);
                }
            }
        }
        boolean z12 = false;
        for (int i12 = 0; i12 < node.getChildNodes().getLength(); i12++) {
            Node item2 = node.getChildNodes().item(i12);
            if (!h(item2)) {
                if (item2.getNodeType() != 1 || z12) {
                    if (!z12) {
                        throw new XMPException("Children of resource property element must be XML elements", 202);
                    }
                    throw new XMPException("Invalid child of resource property element", 202);
                }
                boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item2.getNamespaceURI());
                String localName2 = item2.getLocalName();
                if (equals && "Bag".equals(localName2)) {
                    a11.t().s(true);
                } else if (equals && "Seq".equals(localName2)) {
                    a11.t().s(true).v(true);
                } else if (equals && "Alt".equals(localName2)) {
                    a11.t().s(true).v(true).u(true);
                } else {
                    a11.t().B(true);
                    if (!equals && !"Description".equals(localName2)) {
                        String namespaceURI2 = item2.getNamespaceURI();
                        if (namespaceURI2 == null) {
                            throw new XMPException("All XML elements must be in a namespace", 203);
                        }
                        b(a11, "rdf:type", namespaceURI2 + CoreConstants.COLON_CHAR + localName2);
                    }
                }
                l(kVar, a11, item2, false);
                if (a11.r()) {
                    c(a11);
                } else if (a11.t().k()) {
                    n.d(a11);
                }
                z12 = true;
            }
        }
        if (!z12) {
            throw new XMPException("Missing child of resource property element", 202);
        }
    }
}