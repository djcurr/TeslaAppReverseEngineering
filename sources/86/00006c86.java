package ezvcard.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes5.dex */
public final class k {
    public static void a(DocumentBuilderFactory documentBuilderFactory) {
        HashMap hashMap = new HashMap();
        hashMap.put("http://apache.org/xml/features/disallow-doctype-decl", Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        hashMap.put("http://xml.org/sax/features/external-general-entities", bool);
        hashMap.put("http://xml.org/sax/features/external-parameter-entities", bool);
        hashMap.put("http://apache.org/xml/features/nonvalidating/load-external-dtd", bool);
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                documentBuilderFactory.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            } catch (ParserConfigurationException unused) {
            }
        }
        documentBuilderFactory.setXIncludeAware(false);
        documentBuilderFactory.setExpandEntityReferences(false);
    }

    public static void b(Transformer transformer, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                transformer.setOutputProperty(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static Document c() {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        } catch (ParserConfigurationException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static Document d(Reader reader) {
        return f(new InputSource(reader));
    }

    public static Document e(String str) {
        try {
            return d(new StringReader(str));
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static Document f(InputSource inputSource) {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        a(newInstance);
        try {
            return newInstance.newDocumentBuilder().parse(inputSource);
        } catch (ParserConfigurationException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static String g(Node node) {
        return h(node, new HashMap());
    }

    public static String h(Node node, Map<String, String> map) {
        try {
            StringWriter stringWriter = new StringWriter();
            i(node, stringWriter, map);
            return stringWriter.toString();
        } catch (TransformerException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static void i(Node node, Writer writer, Map<String, String> map) {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            b(newTransformer, map);
            newTransformer.transform(new DOMSource(node), new StreamResult(writer));
        } catch (TransformerConfigurationException e11) {
            throw new RuntimeException(e11);
        } catch (TransformerFactoryConfigurationError e12) {
            throw new RuntimeException(e12);
        }
    }
}