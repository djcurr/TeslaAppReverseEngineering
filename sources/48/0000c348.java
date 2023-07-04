package yv;

import com.withpersona.sdk.inquiry.governmentid.network.CheckVerificationResponse;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationRequest;
import com.withpersona.sdk.inquiry.governmentid.network.CreateVerificationResponse;
import com.withpersona.sdk.inquiry.governmentid.network.SubmitVerificationRequest;
import com.withpersona.sdk.inquiry.governmentid.network.SubmitVerificationResponse;
import java.util.List;
import kotlin.Metadata;
import m80.f;
import m80.i;
import m80.k;
import m80.l;
import m80.o;
import m80.p;
import m80.q;
import m80.s;
import okhttp3.MultipartBody;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lyv/b;", "", "", "sessionToken", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationRequest;", "request", "Lretrofit2/s;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationResponse;", cg.c.f9084i, "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/governmentid/network/CreateVerificationRequest;Lzz/d;)Ljava/lang/Object;", "verificationToken", "", "Lokhttp3/MultipartBody$Part;", "body", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/governmentid/network/SubmitVerificationRequest;", "Lcom/withpersona/sdk/inquiry/governmentid/network/SubmitVerificationResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/governmentid/network/SubmitVerificationRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/governmentid/network/CheckVerificationResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "government-id_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface b {
    @f("/api/internal/verify/v1/verification/government-ids/{verificationToken}")
    Object a(@i("Authorization") String str, @s("verificationToken") String str2, zz.d<? super retrofit2.s<CheckVerificationResponse>> dVar);

    @l
    @p("/api/internal/verify/v1/verification/government-ids/{verificationToken}")
    @k({"Accept: multipart/form-data"})
    Object b(@i("Authorization") String str, @s("verificationToken") String str2, @q List<MultipartBody.Part> list, zz.d<? super retrofit2.s<Object>> dVar);

    @o("/api/internal/verify/v1/verification/government-ids")
    Object c(@i("Authorization") String str, @m80.a CreateVerificationRequest createVerificationRequest, zz.d<? super retrofit2.s<CreateVerificationResponse>> dVar);

    @o("/api/internal/verify/v1/verification/government-ids/{verificationToken}/submit")
    Object d(@i("Authorization") String str, @s("verificationToken") String str2, @m80.a SubmitVerificationRequest submitVerificationRequest, zz.d<? super retrofit2.s<SubmitVerificationResponse>> dVar);
}