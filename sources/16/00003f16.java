package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<zp.d> f17945a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Integer, Set<zp.d>> f17946b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zp.d dVar = zp.d.f60576d;
        linkedHashSet.add(dVar);
        zp.d dVar2 = zp.d.f60577e;
        linkedHashSet.add(dVar2);
        zp.d dVar3 = zp.d.f60578f;
        linkedHashSet.add(dVar3);
        zp.d dVar4 = zp.d.f60581i;
        linkedHashSet.add(dVar4);
        zp.d dVar5 = zp.d.f60582j;
        linkedHashSet.add(dVar5);
        zp.d dVar6 = zp.d.f60583k;
        linkedHashSet.add(dVar6);
        zp.d dVar7 = zp.d.f60579g;
        linkedHashSet.add(dVar7);
        zp.d dVar8 = zp.d.f60580h;
        linkedHashSet.add(dVar8);
        zp.d dVar9 = zp.d.f60584l;
        linkedHashSet.add(dVar9);
        f17945a = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(dVar4);
        hashSet2.add(dVar5);
        hashSet3.add(dVar6);
        hashSet3.add(dVar);
        hashSet3.add(dVar7);
        hashSet3.add(dVar9);
        hashSet4.add(dVar2);
        hashSet5.add(dVar3);
        hashSet5.add(dVar8);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        f17946b = Collections.unmodifiableMap(hashMap);
    }

    private static void a(SecretKey secretKey, zp.d dVar) {
        try {
            if (dVar.b() == nq.e.f(secretKey.getEncoded())) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + dVar + " must be " + dVar.b() + " bits");
        } catch (IntegerOverflowException e11) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e11.getMessage());
        }
    }

    public static byte[] b(zp.l lVar, nq.c cVar, nq.c cVar2, nq.c cVar3, nq.c cVar4, SecretKey secretKey, eq.c cVar5) {
        byte[] c11;
        a(secretKey, lVar.t());
        byte[] b11 = a.b(lVar);
        if (!lVar.t().equals(zp.d.f60576d) && !lVar.t().equals(zp.d.f60577e) && !lVar.t().equals(zp.d.f60578f)) {
            if (!lVar.t().equals(zp.d.f60581i) && !lVar.t().equals(zp.d.f60582j) && !lVar.t().equals(zp.d.f60583k)) {
                if (!lVar.t().equals(zp.d.f60579g) && !lVar.t().equals(zp.d.f60580h)) {
                    if (lVar.t().equals(zp.d.f60584l)) {
                        c11 = c0.a(secretKey, cVar2.a(), cVar3.a(), b11, cVar4.a());
                    } else {
                        throw new JOSEException(e.b(lVar.t(), f17945a));
                    }
                } else {
                    c11 = b.d(lVar, secretKey, cVar, cVar2, cVar3, cVar4, cVar5.d(), cVar5.f());
                }
            } else {
                c11 = c.c(secretKey, cVar2.a(), cVar3.a(), b11, cVar4.a(), cVar5.d());
            }
        } else {
            c11 = b.c(secretKey, cVar2.a(), cVar3.a(), b11, cVar4.a(), cVar5.d(), cVar5.f());
        }
        return n.b(lVar, c11);
    }

    public static zp.i c(zp.l lVar, byte[] bArr, SecretKey secretKey, nq.c cVar, eq.c cVar2) {
        byte[] h11;
        f f11;
        byte[] bArr2;
        a(secretKey, lVar.t());
        byte[] a11 = n.a(lVar, bArr);
        byte[] b11 = a.b(lVar);
        if (!lVar.t().equals(zp.d.f60576d) && !lVar.t().equals(zp.d.f60577e) && !lVar.t().equals(zp.d.f60578f)) {
            if (!lVar.t().equals(zp.d.f60581i) && !lVar.t().equals(zp.d.f60582j) && !lVar.t().equals(zp.d.f60583k)) {
                if (!lVar.t().equals(zp.d.f60579g) && !lVar.t().equals(zp.d.f60580h)) {
                    if (lVar.t().equals(zp.d.f60584l)) {
                        nq.f fVar = new nq.f(null);
                        f11 = c0.b(secretKey, fVar, a11, b11);
                        bArr2 = (byte[]) fVar.a();
                    } else {
                        throw new JOSEException(e.b(lVar.t(), f17945a));
                    }
                } else {
                    h11 = b.h(cVar2.b());
                    f11 = b.g(lVar, secretKey, cVar, h11, a11, cVar2.d(), cVar2.f());
                }
            } else {
                nq.f fVar2 = new nq.f(c.e(cVar2.b()));
                f11 = c.d(secretKey, fVar2, a11, b11, cVar2.d());
                bArr2 = (byte[]) fVar2.a();
            }
            return new zp.i(lVar, cVar, nq.c.e(bArr2), nq.c.e(f11.b()), nq.c.e(f11.a()));
        }
        h11 = b.h(cVar2.b());
        f11 = b.f(secretKey, h11, a11, b11, cVar2.d(), cVar2.f());
        bArr2 = h11;
        return new zp.i(lVar, cVar, nq.c.e(bArr2), nq.c.e(f11.b()), nq.c.e(f11.a()));
    }

    public static SecretKey d(zp.d dVar, SecureRandom secureRandom) {
        Set<zp.d> set = f17945a;
        if (set.contains(dVar)) {
            byte[] bArr = new byte[nq.e.c(dVar.b())];
            secureRandom.nextBytes(bArr);
            return new SecretKeySpec(bArr, "AES");
        }
        throw new JOSEException(e.b(dVar, set));
    }
}