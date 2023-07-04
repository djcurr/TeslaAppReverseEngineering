package vv;

import cg.c;
import com.withpersona.sdk.inquiry.document.network.CreateDocumentResponse;
import com.withpersona.sdk.inquiry.document.network.CreateDocumentVerificationRequest;
import com.withpersona.sdk.inquiry.document.network.CreateDocumentVerificationResponse;
import com.withpersona.sdk.inquiry.document.network.DocumentStatusResponse;
import com.withpersona.sdk.inquiry.document.network.DocumentVerificationStatusResponse;
import com.withpersona.sdk.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk.inquiry.document.network.SubmitDocumentVerificationRequest;
import java.util.List;
import kotlin.Metadata;
import m80.f;
import m80.i;
import m80.k;
import m80.l;
import m80.o;
import m80.q;
import m80.s;
import okhttp3.MultipartBody;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0014H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lvv/a;", "", "", "sessionToken", "", "Lokhttp3/MultipartBody$Part;", "document", "Lretrofit2/s;", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentResponse;", "e", "(Ljava/lang/String;Ljava/util/List;Lzz/d;)Ljava/lang/Object;", "documentID", "Lcom/withpersona/sdk/inquiry/document/network/SubmitDocumentRequest;", "request", "Lcom/withpersona/sdk/inquiry/document/network/DocumentStatusResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/document/network/SubmitDocumentRequest;Lzz/d;)Ljava/lang/Object;", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest;", "Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationResponse;", "d", "(Ljava/lang/String;Lcom/withpersona/sdk/inquiry/document/network/CreateDocumentVerificationRequest;Lzz/d;)Ljava/lang/Object;", "verificationId", "Lcom/withpersona/sdk/inquiry/document/network/SubmitDocumentVerificationRequest;", "Lcom/withpersona/sdk/inquiry/document/network/DocumentVerificationStatusResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/document/network/SubmitDocumentVerificationRequest;Lzz/d;)Ljava/lang/Object;", c.f9084i, "document_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface a {
    @o("/api/internal/verify/v1/verification/documents/{verificationId}/submit")
    Object a(@i("Authorization") String str, @s("verificationId") String str2, @m80.a SubmitDocumentVerificationRequest submitDocumentVerificationRequest, d<? super retrofit2.s<DocumentVerificationStatusResponse>> dVar);

    @f("api/internal/verify/v1/document/generics/{documentID}")
    Object b(@i("Authorization") String str, @s("documentID") String str2, d<? super retrofit2.s<DocumentStatusResponse>> dVar);

    @f("/api/internal/verify/v1/verification/documents/{verificationId}")
    Object c(@i("Authorization") String str, @s("verificationId") String str2, d<? super retrofit2.s<DocumentVerificationStatusResponse>> dVar);

    @o("/api/internal/verify/v1/verification/documents")
    Object d(@i("Authorization") String str, @m80.a CreateDocumentVerificationRequest createDocumentVerificationRequest, d<? super retrofit2.s<CreateDocumentVerificationResponse>> dVar);

    @l
    @k({"Accept: multipart/form-data"})
    @o("/api/internal/verify/v1/document/generics")
    Object e(@i("Authorization") String str, @q List<MultipartBody.Part> list, d<? super retrofit2.s<CreateDocumentResponse>> dVar);

    @o("api/internal/verify/v1/document/generics/{documentID}/submit")
    Object f(@i("Authorization") String str, @s("documentID") String str2, @m80.a SubmitDocumentRequest submitDocumentRequest, d<? super retrofit2.s<DocumentStatusResponse>> dVar);
}