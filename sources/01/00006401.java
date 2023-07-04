package com.withpersona.sdk.reactnative;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.withpersona.sdk.inquiry.Attributes;
import com.withpersona.sdk.inquiry.Environment;
import com.withpersona.sdk.inquiry.Fields;
import com.withpersona.sdk.inquiry.Inquiry;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class PersonaInquiryModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String ACCESS_TOKEN = "accessToken";
    private static final String ACCOUNT_ID = "accountId";
    private static final String ENVIRONMENT = "environment";
    private static final String FIELDS = "fields";
    private static final String FIELD_ADDITIONAL_FIELDS = "additionalFields";
    private static final String FIELD_ADDRESS = "address";
    private static final String FIELD_ADDRESS_CITY = "city";
    private static final String FIELD_ADDRESS_COUNTRY_CODE = "countryCode";
    private static final String FIELD_ADDRESS_POSTAL_CODE = "postalCode";
    private static final String FIELD_ADDRESS_STREET_1 = "street1";
    private static final String FIELD_ADDRESS_STREET_2 = "street2";
    private static final String FIELD_ADDRESS_SUBDIVISION = "subdivision";
    private static final String FIELD_BIRTHDATE = "birthdate";
    private static final String FIELD_EMAIL_ADDRESS = "emailAddress";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_NAME_FIRST = "first";
    private static final String FIELD_NAME_LAST = "last";
    private static final String FIELD_NAME_MIDDLE = "middle";
    private static final String FIELD_PHONE_NUMBER = "phoneNumber";
    private static final String INQUIRY_ID = "inquiryId";
    private static final int PERSONA_INQUIRY_REQUEST_CODE = 31415;
    private static final String REFERENCE_ID = "referenceId";
    private static final String TEMPLATE_ID = "templateId";
    private final ReactApplicationContext reactContext;

    public PersonaInquiryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Environment environmentFromString(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("production")) {
            return Environment.PRODUCTION;
        }
        if (str.equals("sandbox")) {
            return Environment.SANDBOX;
        }
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PersonaInquiry";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        if (i11 == PERSONA_INQUIRY_REQUEST_CODE) {
            Inquiry.Response onActivityResult = Inquiry.onActivityResult(intent);
            DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
            if (onActivityResult instanceof Inquiry.Response.Success) {
                Inquiry.Response.Success success = (Inquiry.Response.Success) onActivityResult;
                Attributes attributes = success.getAttributes();
                WritableMap createMap = Arguments.createMap();
                Attributes.Name name = attributes.getName();
                if (name != null) {
                    createMap.putString(FIELD_NAME_FIRST, name.getFirst());
                    createMap.putString(FIELD_NAME_MIDDLE, name.getMiddle());
                    createMap.putString(FIELD_NAME_LAST, name.getLast());
                }
                WritableMap createMap2 = Arguments.createMap();
                Attributes.Address address = attributes.getAddress();
                if (address != null) {
                    createMap2.putString(FIELD_ADDRESS_STREET_1, address.getStreet1());
                    createMap2.putString(FIELD_ADDRESS_STREET_2, address.getStreet2());
                    createMap2.putString(FIELD_ADDRESS_CITY, address.getCity());
                    createMap2.putString(FIELD_ADDRESS_SUBDIVISION, address.getSubdivision());
                    createMap2.putString("subdivisionAbbr", address.getSubdivisionAbbr());
                    createMap2.putString(FIELD_ADDRESS_POSTAL_CODE, address.getPostalCode());
                    createMap2.putString(FIELD_ADDRESS_COUNTRY_CODE, address.getCountryCode());
                }
                WritableMap createMap3 = Arguments.createMap();
                Date birthdate = attributes.getBirthdate();
                if (birthdate != null) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    createMap3.putString(FIELD_BIRTHDATE, simpleDateFormat.format(birthdate));
                } else {
                    createMap3.putString(FIELD_BIRTHDATE, null);
                }
                createMap3.putMap("name", createMap);
                createMap3.putMap("address", createMap2);
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString(INQUIRY_ID, success.getInquiryId());
                createMap4.putMap("attributes", createMap3);
                rCTDeviceEventEmitter.emit("onSuccess", createMap4);
            } else if (onActivityResult instanceof Inquiry.Response.Failure) {
                WritableMap createMap5 = Arguments.createMap();
                createMap5.putString(INQUIRY_ID, ((Inquiry.Response.Failure) onActivityResult).getInquiryId());
                rCTDeviceEventEmitter.emit("onFailed", createMap5);
            } else if (onActivityResult instanceof Inquiry.Response.Cancel) {
                rCTDeviceEventEmitter.emit("onCancelled", null);
            } else if (onActivityResult instanceof Inquiry.Response.Error) {
                WritableMap createMap6 = Arguments.createMap();
                createMap6.putString("error", ((Inquiry.Response.Error) onActivityResult).getDebugMessage());
                rCTDeviceEventEmitter.emit("onError", createMap6);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void startInquiry(ReadableMap readableMap) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        String string = readableMap.hasKey(INQUIRY_ID) ? readableMap.getString(INQUIRY_ID) : null;
        String string2 = readableMap.hasKey(TEMPLATE_ID) ? readableMap.getString(TEMPLATE_ID) : null;
        if (string != null) {
            Inquiry.InquiryBuilder fromInquiry = Inquiry.fromInquiry(string);
            String string3 = readableMap.hasKey(ACCESS_TOKEN) ? readableMap.getString(ACCESS_TOKEN) : null;
            if (string3 != null) {
                fromInquiry = fromInquiry.accessToken(string3);
            }
            if (currentActivity != null) {
                fromInquiry.build().start(currentActivity, PERSONA_INQUIRY_REQUEST_CODE);
            }
        }
        if (string2 != null) {
            Inquiry.TemplateBuilder fromTemplate = Inquiry.fromTemplate(string2);
            String string4 = readableMap.hasKey(REFERENCE_ID) ? readableMap.getString(REFERENCE_ID) : null;
            if (string4 != null) {
                fromTemplate = fromTemplate.referenceId(string4);
            }
            String string5 = readableMap.hasKey(ACCOUNT_ID) ? readableMap.getString(ACCOUNT_ID) : null;
            if (string5 != null) {
                fromTemplate = fromTemplate.accountId(string5);
            }
            Environment environmentFromString = environmentFromString(readableMap.hasKey(ENVIRONMENT) ? readableMap.getString(ENVIRONMENT) : null);
            if (environmentFromString != null) {
                fromTemplate = fromTemplate.environment(environmentFromString);
            }
            ReadableMap map = readableMap.hasKey(FIELDS) ? readableMap.getMap(FIELDS) : null;
            if (map != null) {
                Fields.Builder builder = new Fields.Builder();
                ReadableMap map2 = map.hasKey("name") ? map.getMap("name") : null;
                if (map2 != null) {
                    builder = builder.name(map2.hasKey(FIELD_NAME_FIRST) ? map2.getString(FIELD_NAME_FIRST) : null, map2.hasKey(FIELD_NAME_MIDDLE) ? map2.getString(FIELD_NAME_MIDDLE) : null, map2.hasKey(FIELD_NAME_LAST) ? map2.getString(FIELD_NAME_LAST) : null);
                }
                Fields.Builder builder2 = builder;
                ReadableMap map3 = map.hasKey("address") ? map.getMap("address") : null;
                if (map3 != null) {
                    builder2 = builder2.address(map3.hasKey(FIELD_ADDRESS_STREET_1) ? map3.getString(FIELD_ADDRESS_STREET_1) : null, map3.hasKey(FIELD_ADDRESS_STREET_2) ? map3.getString(FIELD_ADDRESS_STREET_2) : null, map3.hasKey(FIELD_ADDRESS_CITY) ? map3.getString(FIELD_ADDRESS_CITY) : null, map3.hasKey(FIELD_ADDRESS_SUBDIVISION) ? map3.getString(FIELD_ADDRESS_SUBDIVISION) : null, map3.hasKey(FIELD_ADDRESS_POSTAL_CODE) ? map3.getString(FIELD_ADDRESS_POSTAL_CODE) : null, map3.hasKey(FIELD_ADDRESS_COUNTRY_CODE) ? map3.getString(FIELD_ADDRESS_COUNTRY_CODE) : null);
                }
                String string6 = map.hasKey(FIELD_PHONE_NUMBER) ? map.getString(FIELD_PHONE_NUMBER) : null;
                if (string6 != null) {
                    builder2 = builder2.phoneNumber(string6);
                }
                String string7 = map.hasKey(FIELD_EMAIL_ADDRESS) ? map.getString(FIELD_EMAIL_ADDRESS) : null;
                if (string7 != null) {
                    builder2 = builder2.emailAddress(string7);
                }
                String string8 = map.hasKey(FIELD_BIRTHDATE) ? map.getString(FIELD_BIRTHDATE) : null;
                if (string8 != null) {
                    try {
                        Locale locale = Locale.US;
                        Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale).parse(string8);
                        if (parse != null) {
                            builder2 = builder2.field(FIELD_BIRTHDATE, new SimpleDateFormat("yyyy-MM-dd", locale).format(parse));
                        }
                    } catch (ParseException unused) {
                    }
                }
                ReadableMap map4 = map.hasKey(FIELD_ADDITIONAL_FIELDS) ? map.getMap(FIELD_ADDITIONAL_FIELDS) : null;
                if (map4 != null) {
                    for (Map.Entry<String, Object> entry : map4.toHashMap().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            builder2.field(key, (String) value);
                        } else if (value instanceof Double) {
                            builder2.field(key, ((Double) value).intValue());
                        }
                        if (value instanceof Boolean) {
                            builder2.field(key, ((Boolean) value).booleanValue());
                        }
                    }
                }
                fromTemplate = fromTemplate.fields(builder2.build());
            }
            if (currentActivity != null) {
                fromTemplate.build().start(currentActivity, PERSONA_INQUIRY_REQUEST_CODE);
            }
        }
    }
}