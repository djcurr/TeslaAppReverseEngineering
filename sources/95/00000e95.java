package bw;

import com.withpersona.sdk.inquiry.internal.network.CheckInquiryResponse;
import com.withpersona.sdk.inquiry.internal.network.ContactSupportRequest;
import com.withpersona.sdk.inquiry.internal.network.CreateInquiryRequest;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionRequest;
import com.withpersona.sdk.inquiry.internal.network.CreateInquirySessionResponse;
import com.withpersona.sdk.inquiry.internal.network.UpdateInquiryRequest;
import kotlin.Metadata;
import m80.o;
import m80.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000f\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lbw/n;", "", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest;", "request", "Lretrofit2/s;", "Lcom/withpersona/sdk/inquiry/internal/network/CheckInquiryResponse;", "b", "(Lcom/withpersona/sdk/inquiry/internal/network/CreateInquiryRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest;", "", "deviceId", "Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionResponse;", "d", "(Lcom/withpersona/sdk/inquiry/internal/network/CreateInquirySessionRequest;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "sessionToken", "inquiryId", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest;", cg.c.f9084i, "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/UpdateInquiryRequest;Lzz/d;)Ljava/lang/Object;", "Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk/inquiry/internal/network/ContactSupportRequest;Lzz/d;)Ljava/lang/Object;", "inquiry-internal_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface n {
    @m80.f("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object a(@m80.i("Authorization") String str, @m80.i("Persona-Device-Id") String str2, @s("inquiryId") String str3, zz.d<? super retrofit2.s<CheckInquiryResponse>> dVar);

    @o("/api/internal/verify/v1/inquiries")
    Object b(@m80.a CreateInquiryRequest createInquiryRequest, zz.d<? super retrofit2.s<CheckInquiryResponse>> dVar);

    @m80.n("/api/internal/verify/v1/inquiries/{inquiryId}")
    Object c(@m80.i("Authorization") String str, @s("inquiryId") String str2, @m80.a UpdateInquiryRequest updateInquiryRequest, zz.d<? super retrofit2.s<CheckInquiryResponse>> dVar);

    @o("/api/internal/verify/v1/inquiry-sessions")
    Object d(@m80.a CreateInquirySessionRequest createInquirySessionRequest, @m80.i("Persona-Device-Id") String str, zz.d<? super retrofit2.s<CreateInquirySessionResponse>> dVar);

    @o("/api/internal/verify/v1/inquiries/{inquiryId}/send-support-ticket")
    Object e(@m80.i("Authorization") String str, @s("inquiryId") String str2, @m80.a ContactSupportRequest contactSupportRequest, zz.d<? super retrofit2.s<CheckInquiryResponse>> dVar);
}