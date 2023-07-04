package l6;

import com.adobe.xmp.XMPException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f37035a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static DocumentBuilderFactory f37036b = a();

    private static DocumentBuilderFactory a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return newInstance;
    }

    private static Object[] b(Node node, boolean z11, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
            Node item = childNodes.item(i11);
            if (7 == item.getNodeType()) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) item;
                if ("xpacket".equals(processingInstruction.getTarget())) {
                    if (objArr != null) {
                        objArr[2] = processingInstruction.getData();
                    }
                }
            }
            if (3 != item.getNodeType() && 7 != item.getNodeType()) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                    return b(item, false, objArr);
                }
                if (!z11 && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                    if (objArr != null) {
                        objArr[0] = item;
                        objArr[1] = f37035a;
                    }
                    return objArr;
                }
                Object[] b11 = b(item, z11, objArr);
                if (b11 != null) {
                    return b11;
                }
            }
        }
        return null;
    }

    public static k6.c c(Object obj, n6.d dVar) {
        e.b(obj);
        if (dVar == null) {
            dVar = new n6.d();
        }
        Object[] b11 = b(e(obj, dVar), dVar.l(), new Object[3]);
        if (b11 == null || b11[1] != f37035a) {
            return new k();
        }
        k i11 = f.i((Node) b11[0]);
        i11.b((String) b11[2]);
        return !dVar.k() ? o.h(i11, dVar) : i11;
    }

    private static Document d(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = f37036b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler(null);
            return newDocumentBuilder.parse(inputSource);
        } catch (IOException e11) {
            throw new XMPException("Error reading the XML-file", 204, e11);
        } catch (ParserConfigurationException e12) {
            throw new XMPException("XML Parser not correctly configured", 0, e12);
        } catch (SAXException e13) {
            throw new XMPException("XML parsing failure", 201, e13);
        }
    }

    private static Document e(Object obj, n6.d dVar) {
        return obj instanceof InputStream ? g((InputStream) obj, dVar) : obj instanceof byte[] ? f(new a((byte[]) obj), dVar) : h((String) obj, dVar);
    }

    private static Document f(a aVar, n6.d dVar) {
        InputSource inputSource = new InputSource(aVar.f());
        try {
            if (dVar.i()) {
                try {
                    f37036b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return d(inputSource);
        } catch (XMPException e11) {
            if (e11.a() == 201 || e11.a() == 204) {
                if (dVar.h()) {
                    aVar = d.a(aVar);
                }
                if (dVar.j()) {
                    try {
                        return d(new InputSource(new b(new InputStreamReader(aVar.f(), aVar.g()))));
                    } catch (UnsupportedEncodingException unused2) {
                        throw new XMPException("Unsupported Encoding", 9, e11);
                    }
                }
                return d(new InputSource(aVar.f()));
            }
            throw e11;
        }
    }

    private static Document g(InputStream inputStream, n6.d dVar) {
        if (dVar.h() || dVar.j()) {
            try {
                return f(new a(inputStream), dVar);
            } catch (IOException e11) {
                throw new XMPException("Error reading the XML-file", 204, e11);
            }
        }
        return d(new InputSource(inputStream));
    }

    private static Document h(String str, n6.d dVar) {
        new InputSource(new StringReader(str));
        try {
            if (dVar.i()) {
                try {
                    f37036b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return d(new InputSource(new StringReader(str)));
        } catch (XMPException e11) {
            if (e11.a() == 201 && dVar.j()) {
                return d(new InputSource(new b(new StringReader(str))));
            }
            throw e11;
        }
    }
}