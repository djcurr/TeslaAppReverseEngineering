package yu;

import com.tesla.data.HttpMethodType;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface f {

    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ hy.m a(f fVar, HttpMethodType httpMethodType, String str, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    num = 15;
                }
                Integer num2 = num;
                if ((i11 & 8) != 0) {
                    z11 = true;
                }
                boolean z13 = z11;
                if ((i11 & 16) != 0) {
                    z12 = false;
                }
                return fVar.b(httpMethodType, str, num2, z13, z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }

        public static /* synthetic */ hy.m b(f fVar, HttpMethodType httpMethodType, String str, Map map, String str2, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                return fVar.d(httpMethodType, str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : map2, (i11 & 32) != 0 ? null : map3, (i11 & 64) != 0 ? 15 : num, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? false : z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }

        public static /* synthetic */ hy.m c(f fVar, HttpMethodType httpMethodType, String str, Map map, Map map2, Map map3, Map map4, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                return fVar.e(httpMethodType, str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : map2, (i11 & 16) != 0 ? null : map3, (i11 & 32) != 0 ? null : map4, (i11 & 64) != 0 ? 15 : num, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? false : z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }

        public static /* synthetic */ hy.m d(f fVar, HttpMethodType httpMethodType, String str, Map map, JSONObject jSONObject, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                return fVar.a(httpMethodType, str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : jSONObject, (i11 & 16) != 0 ? null : map2, (i11 & 32) != 0 ? null : map3, (i11 & 64) != 0 ? 15 : num, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? false : z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }

        public static /* synthetic */ hy.m e(f fVar, String str, String str2, Map map, JSONObject jSONObject, Map map2, Map map3, Integer num, boolean z11, boolean z12, int i11, Object obj) {
            if (obj == null) {
                return fVar.c(str, str2, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : jSONObject, (i11 & 16) != 0 ? null : map2, (i11 & 32) != 0 ? null : map3, (i11 & 64) != 0 ? 15 : num, (i11 & 128) != 0 ? true : z11, (i11 & 256) != 0 ? false : z12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
    }

    hy.m<com.tesla.data.oapi.k> a(HttpMethodType httpMethodType, String str, Map<String, ? extends Object> map, JSONObject jSONObject, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12);

    hy.m<com.tesla.data.oapi.k> b(HttpMethodType httpMethodType, String str, Integer num, boolean z11, boolean z12);

    hy.m<com.tesla.data.oapi.k> c(String str, String str2, Map<String, ? extends Object> map, JSONObject jSONObject, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12);

    hy.m<com.tesla.data.oapi.k> d(HttpMethodType httpMethodType, String str, Map<String, ? extends Object> map, String str2, Map<String, ? extends Object> map2, Map<String, String> map3, Integer num, boolean z11, boolean z12);

    hy.m<com.tesla.data.oapi.k> e(HttpMethodType httpMethodType, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, String> map4, Integer num, boolean z11, boolean z12);
}