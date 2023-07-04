package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.vision.barcode.Barcode;

/* loaded from: classes3.dex */
public final class zzb implements Parcelable.Creator<Barcode> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        Barcode.Email email = null;
        Barcode.Phone phone = null;
        Barcode.Sms sms = null;
        Barcode.WiFi wiFi = null;
        Barcode.UrlBookmark urlBookmark = null;
        Barcode.GeoPoint geoPoint = null;
        Barcode.CalendarEvent calendarEvent = null;
        Barcode.ContactInfo contactInfo = null;
        Barcode.DriverLicense driverLicense = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, readHeader, Point.CREATOR);
                    break;
                case 7:
                    email = (Barcode.Email) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.Email.CREATOR);
                    break;
                case 8:
                    phone = (Barcode.Phone) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.Phone.CREATOR);
                    break;
                case 9:
                    sms = (Barcode.Sms) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (Barcode.WiFi) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (Barcode.UrlBookmark) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (Barcode.GeoPoint) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (Barcode.CalendarEvent) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (Barcode.ContactInfo) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (Barcode.DriverLicense) SafeParcelReader.createParcelable(parcel, readHeader, Barcode.DriverLicense.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new Barcode(i11, str, str2, i12, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Barcode[] newArray(int i11) {
        return new Barcode[i11];
    }
}