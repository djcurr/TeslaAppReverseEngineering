package com.google.gson;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes2.dex */
public final class n {
    public static k a(Reader reader) {
        try {
            tn.a aVar = new tn.a(reader);
            k b11 = b(aVar);
            if (!b11.i() && aVar.Q0() != com.google.gson.stream.a.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return b11;
        } catch (MalformedJsonException e11) {
            throw new JsonSyntaxException(e11);
        } catch (IOException e12) {
            throw new JsonIOException(e12);
        } catch (NumberFormatException e13) {
            throw new JsonSyntaxException(e13);
        }
    }

    public static k b(tn.a aVar) {
        boolean a02 = aVar.a0();
        aVar.b1(true);
        try {
            try {
                return on.l.a(aVar);
            } catch (OutOfMemoryError e11) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e11);
            } catch (StackOverflowError e12) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e12);
            }
        } finally {
            aVar.b1(a02);
        }
    }

    public static k c(String str) {
        return a(new StringReader(str));
    }
}