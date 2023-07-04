package expo.modules.kotlin.modules;

import android.app.Activity;
import android.content.Intent;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.AsyncFunction;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromise;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeKt;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.ViewManagerDefinitionBuilder;
import h00.a;
import h00.l;
import h00.p;
import h00.q;
import h00.r;
import h00.t;
import h00.u;
import h00.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.r0;
import wz.s0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\u000b\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bH\u0007J\"\u0010\f\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bJ?\u0010\u000b\u001a\u00020\u00062.\u0010\u000b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\r\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0007¢\u0006\u0004\b\u000b\u0010\u000fJ=\u0010\f\u001a\u00020\u00062.\u0010\u000b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\r\"\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\u0004\b\f\u0010\u000fJ-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0004\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bø\u0001\u0000J:\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0016H\u0087\bø\u0001\u0000JH\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\bø\u0001\u0000JV\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042 \b\u0004\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000Jd\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042&\b\u0004\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000Jr\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042,\b\u0004\u0010\u0010\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001eH\u0087\bø\u0001\u0000J\u0080\u0001\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000422\b\u0004\u0010\u0010\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000 H\u0087\bø\u0001\u0000J\u008e\u0001\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000428\b\u0004\u0010\u0010\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\"H\u0087\bø\u0001\u0000J\u009c\u0001\u0010\u0013\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u0001\"\u0006\b\b\u0010#\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042>\b\u0004\u0010\u0010\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000$H\u0087\bø\u0001\u0000J-\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0004\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010\u0012J-\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0004\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0012J,\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bø\u0001\u0000J,\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\bø\u0001\u0000J:\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0016H\u0087\bø\u0001\u0000J:\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000JH\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\bø\u0001\u0000JH\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000JV\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042 \b\u0004\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000JV\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042 \b\u0004\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000Jd\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042&\b\u0004\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000Jd\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042&\b\u0004\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000Jr\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042,\b\u0004\u0010\u0010\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001eH\u0087\bø\u0001\u0000Jr\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042,\b\u0004\u0010\u0010\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000J\u0080\u0001\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000422\b\u0004\u0010\u0010\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000 H\u0087\bø\u0001\u0000J\u0080\u0001\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000422\b\u0004\u0010\u0010\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000J\u008e\u0001\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000428\b\u0004\u0010\u0010\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\"H\u0087\bø\u0001\u0000J\u008e\u0001\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u000428\b\u0004\u0010\u0010\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000\"H\u0086\bø\u0001\u0000J\u009c\u0001\u0010&\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u0001\"\u0006\b\b\u0010#\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042>\b\u0004\u0010\u0010\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000$H\u0087\bø\u0001\u0000J\u009c\u0001\u0010(\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0014\u0018\u0001\"\u0006\b\u0001\u0010\u0015\u0018\u0001\"\u0006\b\u0002\u0010\u0017\u0018\u0001\"\u0006\b\u0003\u0010\u0019\u0018\u0001\"\u0006\b\u0004\u0010\u001b\u0018\u0001\"\u0006\b\u0005\u0010\u001d\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010!\u0018\u0001\"\u0006\b\b\u0010#\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00042>\b\u0004\u0010\u0010\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000J\u0010\u0010&\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010(\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004J \u0010+\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00060\u0016H\u0087\bø\u0001\u0000J \u0010,\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00060\u0016H\u0086\bø\u0001\u0000J\u001c\u0010-\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u0010.\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\u001c\u0010/\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u00100\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\u001c\u00101\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u00102\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\u001c\u00103\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u00104\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\u001c\u00105\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u00106\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J#\u00107\u001a\u00020\u00062\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004H\u0007¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00062\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\r\"\u00020\u0004¢\u0006\u0004\b9\u00108J\u001c\u0010:\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u0010;\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\u001c\u0010<\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0087\bø\u0001\u0000J\u001c\u0010=\u001a\u00020\u00062\u000e\b\u0004\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\bø\u0001\u0000J\"\u0010?\u001a\u00020\u00062\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00060\u0016H\u0087\bø\u0001\u0000J\"\u0010@\u001a\u00020\u00062\u0014\b\u0004\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00060\u0016H\u0086\bø\u0001\u0000J(\u0010C\u001a\u00020\u00062\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00060\u0018H\u0087\bø\u0001\u0000J(\u0010D\u001a\u00020\u00062\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00060\u0018H\u0086\bø\u0001\u0000R$\u0010F\u001a\u0004\u0018\u00010E8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00020)0P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR4\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020T0S8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bU\u0010V\u0012\u0004\b[\u0010K\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR*\u0010]\u001a\u0004\u0018\u00010\\8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b]\u0010^\u0012\u0004\bc\u0010K\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0S8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010V\u0012\u0004\bh\u0010K\u001a\u0004\bg\u0010X\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006k"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "build", "", "name", "Lvz/b0;", "Name", "Lkotlin/Function0;", "", "constantsProvider", "constants", "Constants", "", "Lvz/p;", "([Lvz/p;)V", "body", "functionWithoutArgs", "(Ljava/lang/String;Lh00/a;)V", "function", "R", "P0", "Lkotlin/Function1;", "P1", "Lkotlin/Function2;", "P2", "Lkotlin/Function3;", "P3", "Lkotlin/Function4;", "P4", "Lkotlin/Function5;", "P5", "Lkotlin/Function6;", "P6", "Lkotlin/Function7;", "P7", "Lkotlin/Function8;", "asyncFunctionWithoutArgs", "asyncFunction", "AsyncFunctionWithoutArgs", "AsyncFunction", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lexpo/modules/kotlin/views/ViewManagerDefinitionBuilder;", "viewManager", "ViewManager", "onCreate", "OnCreate", "onDestroy", "OnDestroy", "onActivityEntersForeground", "OnActivityEntersForeground", "onActivityEntersBackground", "OnActivityEntersBackground", "onActivityDestroys", "OnActivityDestroys", "events", "([Ljava/lang/String;)V", "Events", "onStartObserving", "OnStartObserving", "onStopObserving", "OnStopObserving", "Landroid/content/Intent;", "onNewIntent", "OnNewIntent", "Landroid/app/Activity;", "Lexpo/modules/kotlin/events/OnActivityResultPayload;", "onActivityResult", "OnActivityResult", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "getModule$annotations", "()V", "Ljava/lang/String;", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "", "functionBuilders", "Ljava/util/List;", "", "Lexpo/modules/kotlin/functions/AnyFunction;", "methods", "Ljava/util/Map;", "getMethods", "()Ljava/util/Map;", "setMethods", "(Ljava/util/Map;)V", "getMethods$annotations", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "viewManagerDefinition", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getViewManagerDefinition", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "setViewManagerDefinition", "(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V", "getViewManagerDefinition$annotations", "Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/EventListener;", "eventListeners", "getEventListeners", "getEventListeners$annotations", "<init>", "(Lexpo/modules/kotlin/modules/Module;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
@DefinitionMarker
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder {
    private a<? extends Map<String, ? extends Object>> constantsProvider;
    private final Map<EventName, EventListener> eventListeners;
    private EventsDefinition eventsDefinition;
    private List<AsyncFunctionBuilder> functionBuilders;
    private Map<String, AnyFunction> methods;
    private final Module module;
    private String name;
    private ViewManagerDefinition viewManagerDefinition;

    public ModuleDefinitionBuilder() {
        this(null, 1, null);
    }

    public ModuleDefinitionBuilder(Module module) {
        this.module = module;
        this.constantsProvider = ModuleDefinitionBuilder$constantsProvider$1.INSTANCE;
        this.functionBuilders = new ArrayList();
        this.methods = new LinkedHashMap();
        this.eventListeners = new LinkedHashMap();
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getMethods$annotations() {
    }

    public static /* synthetic */ void getModule$annotations() {
    }

    public static /* synthetic */ void getViewManagerDefinition$annotations() {
    }

    public final /* synthetic */ <R> void AsyncFunction(String name, a<? extends R> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$2(body)));
    }

    public final void AsyncFunctionWithoutArgs(String name, a<? extends Object> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void Constants(a<? extends Map<String, ? extends Object>> constantsProvider) {
        s.g(constantsProvider, "constantsProvider");
        this.constantsProvider = constantsProvider;
    }

    public final void Events(String... events) {
        s.g(events, "events");
        this.eventsDefinition = new EventsDefinition(events);
    }

    public final void Name(String name) {
        s.g(name, "name");
        this.name = name;
    }

    public final void OnActivityDestroys(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_DESTROYS;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityDestroys$1(body)));
    }

    public final void OnActivityEntersBackground(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_BACKGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityEntersBackground$1(body)));
    }

    public final void OnActivityEntersForeground(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_FOREGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityEntersForeground$1(body)));
    }

    public final void OnActivityResult(p<? super Activity, ? super OnActivityResultPayload, b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_ACTIVITY_RESULT;
        eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new ModuleDefinitionBuilder$OnActivityResult$1(body)));
    }

    public final void OnCreate(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_CREATE;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnCreate$1(body)));
    }

    public final void OnDestroy(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_DESTROY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnDestroy$1(body)));
    }

    public final void OnNewIntent(l<? super Intent, b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_NEW_INTENT;
        eventListeners.put(eventName, new EventListenerWithPayload(eventName, new ModuleDefinitionBuilder$OnNewIntent$1(body)));
    }

    public final void OnStartObserving(a<b0> body) {
        s.g(body, "body");
        getMethods().put("startObserving", new AsyncFunction("startObserving", new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void OnStopObserving(a<b0> body) {
        s.g(body, "body");
        getMethods().put("stopObserving", new AsyncFunction("stopObserving", new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void ViewManager(l<? super ViewManagerDefinitionBuilder, b0> body) {
        s.g(body, "body");
        if (getViewManagerDefinition() == null) {
            ViewManagerDefinitionBuilder viewManagerDefinitionBuilder = new ViewManagerDefinitionBuilder();
            body.invoke(viewManagerDefinitionBuilder);
            setViewManagerDefinition(viewManagerDefinitionBuilder.build());
            return;
        }
        throw new IllegalArgumentException("The module definition may have exported only one view manager.".toString());
    }

    public final AsyncFunctionBuilder asyncFunction(String name) {
        s.g(name, "name");
        return AsyncFunction(name);
    }

    public final void asyncFunctionWithoutArgs(String name, a<? extends Object> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final ModuleDefinitionData build() {
        int t11;
        int e11;
        int d11;
        Map p11;
        String str = this.name;
        if (str == null) {
            Module module = this.module;
            str = module == null ? null : module.getClass().getSimpleName();
        }
        String str2 = str;
        if (str2 != null) {
            a<? extends Map<String, ? extends Object>> aVar = this.constantsProvider;
            Map<String, AnyFunction> map = this.methods;
            List<AsyncFunctionBuilder> list = this.functionBuilders;
            t11 = x.t(list, 10);
            e11 = r0.e(t11);
            d11 = m00.l.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (AsyncFunctionBuilder asyncFunctionBuilder : list) {
                vz.p<String, AnyFunction> build$expo_modules_core_release = asyncFunctionBuilder.build$expo_modules_core_release();
                linkedHashMap.put(build$expo_modules_core_release.c(), build$expo_modules_core_release.d());
            }
            p11 = s0.p(map, linkedHashMap);
            return new ModuleDefinitionData(str2, aVar, p11, this.viewManagerDefinition, this.eventListeners, this.eventsDefinition);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void constants(a<? extends Map<String, ? extends Object>> constantsProvider) {
        s.g(constantsProvider, "constantsProvider");
        Constants(constantsProvider);
    }

    public final void events(String... events) {
        s.g(events, "events");
        Events((String[]) Arrays.copyOf(events, events.length));
    }

    public final /* synthetic */ <R> void function(String name, a<? extends R> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$function$2(body)));
    }

    public final void functionWithoutArgs(String name, a<? extends Object> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$function$1(body)));
    }

    public final Map<EventName, EventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final Map<String, AnyFunction> getMethods() {
        return this.methods;
    }

    public final Module getModule() {
        return this.module;
    }

    public final ViewManagerDefinition getViewManagerDefinition() {
        return this.viewManagerDefinition;
    }

    public final void name(String name) {
        s.g(name, "name");
        Name(name);
    }

    public final void onActivityDestroys(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_DESTROYS;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityDestroys$1(body)));
    }

    public final void onActivityEntersBackground(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_BACKGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityEntersBackground$1(body)));
    }

    public final void onActivityEntersForeground(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_FOREGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnActivityEntersForeground$1(body)));
    }

    public final void onActivityResult(p<? super Activity, ? super OnActivityResultPayload, b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_ACTIVITY_RESULT;
        eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new ModuleDefinitionBuilder$OnActivityResult$1(body)));
    }

    public final void onCreate(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_CREATE;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnCreate$1(body)));
    }

    public final void onDestroy(a<b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_DESTROY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new ModuleDefinitionBuilder$OnDestroy$1(body)));
    }

    public final void onNewIntent(l<? super Intent, b0> body) {
        s.g(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_NEW_INTENT;
        eventListeners.put(eventName, new EventListenerWithPayload(eventName, new ModuleDefinitionBuilder$OnNewIntent$1(body)));
    }

    public final void onStartObserving(a<b0> body) {
        s.g(body, "body");
        getMethods().put("startObserving", new AsyncFunction("startObserving", new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void onStopObserving(a<b0> body) {
        s.g(body, "body");
        getMethods().put("stopObserving", new AsyncFunction("stopObserving", new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void setMethods(Map<String, AnyFunction> map) {
        s.g(map, "<set-?>");
        this.methods = map;
    }

    public final void setViewManagerDefinition(ViewManagerDefinition viewManagerDefinition) {
        this.viewManagerDefinition = viewManagerDefinition;
    }

    public final void viewManager(l<? super ViewManagerDefinitionBuilder, b0> body) {
        s.g(body, "body");
        if (getViewManagerDefinition() == null) {
            ViewManagerDefinitionBuilder viewManagerDefinitionBuilder = new ViewManagerDefinitionBuilder();
            body.invoke(viewManagerDefinitionBuilder);
            setViewManagerDefinition(viewManagerDefinitionBuilder.build());
            return;
        }
        throw new IllegalArgumentException("The module definition may have exported only one view manager.".toString());
    }

    public final /* synthetic */ <R, P0> void AsyncFunction(String name, l<? super P0, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P0");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$3(body));
        } else {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$4(body));
        }
        methods.put(name, asyncFunction);
    }

    public final void Constants(Pair<String, ? extends Object>... constants) {
        s.g(constants, "constants");
        this.constantsProvider = new ModuleDefinitionBuilder$Constants$1(constants);
    }

    public final /* synthetic */ <R> void asyncFunction(String name, a<? extends R> body) {
        s.g(name, "name");
        s.g(body, "body");
        getMethods().put(name, new AsyncFunction(name, new AnyType[0], new ModuleDefinitionBuilder$AsyncFunction$1(body)));
    }

    public final void constants(Pair<String, ? extends Object>... constants) {
        s.g(constants, "constants");
        Constants((Pair<String, ? extends Object>[]) ((vz.p[]) Arrays.copyOf(constants, constants.length)));
    }

    public final /* synthetic */ <R, P0> void function(String name, l<? super P0, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P0");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, new AnyType[0], new ModuleDefinitionBuilder$function$3(body));
        } else {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr, new ModuleDefinitionBuilder$function$4(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0> void asyncFunction(String name, l<? super P0, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P0");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, new AnyType[0], new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$1(body));
        } else {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$2(body));
        }
        methods.put(name, asyncFunction);
    }

    public /* synthetic */ ModuleDefinitionBuilder(Module module, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : module);
    }

    public final /* synthetic */ <R, P0, P1> void AsyncFunction(String name, p<? super P0, ? super P1, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P1");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$5(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$6(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1> void function(String name, p<? super P0, ? super P1, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P1");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$5(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$6(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1> void asyncFunction(String name, p<? super P0, ? super P1, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P1");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$3(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$4(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2> void AsyncFunction(String name, q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P2");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$7(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$8(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2> void function(String name, q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P2");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$7(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$8(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2> void asyncFunction(String name, q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P2");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$5(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$6(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> void AsyncFunction(String name, r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P3");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$9(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$10(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> void function(String name, r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P3");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$9(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$10(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> void asyncFunction(String name, r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P3");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$7(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$8(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> void AsyncFunction(String name, h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P4");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$11(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$12(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> void function(String name, h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P4");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$11(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$12(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> void asyncFunction(String name, h00.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P4");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$9(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$10(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void AsyncFunction(String name, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P5");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$13(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$14(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void function(String name, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P5");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$13(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$14(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> void asyncFunction(String name, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P5");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$11(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$12(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void AsyncFunction(String name, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P6");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$15(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$16(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void function(String name, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P6");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$15(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$16(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> void asyncFunction(String name, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P6");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$13(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$14(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void AsyncFunction(String name, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P7");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$AsyncFunction$17(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            s.m(6, "P7");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$AsyncFunction$18(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void function(String name, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P7");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$function$17(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            s.m(6, "P7");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$function$18(body));
        }
        methods.put(name, asyncFunction);
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> void asyncFunction(String name, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        AnyFunction asyncFunction;
        s.g(name, "name");
        s.g(body, "body");
        Map<String, AnyFunction> methods = getMethods();
        s.m(4, "P7");
        if (s.c(m0.b(Object.class), m0.b(Promise.class))) {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            AnyType[] anyTypeArr = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunctionWithPromise(name, anyTypeArr, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$15(body));
        } else {
            s.m(6, "P0");
            s.m(6, "P1");
            s.m(6, "P2");
            s.m(6, "P3");
            s.m(6, "P4");
            s.m(6, "P5");
            s.m(6, "P6");
            s.m(6, "P7");
            AnyType[] anyTypeArr2 = {AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null), AnyTypeKt.toAnyType(null)};
            s.l();
            asyncFunction = new AsyncFunction(name, anyTypeArr2, new ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$16(body));
        }
        methods.put(name, asyncFunction);
    }

    public final AsyncFunctionBuilder AsyncFunction(String name) {
        s.g(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name);
        this.functionBuilders.add(asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }
}