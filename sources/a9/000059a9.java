package com.stripe.android.ui.core.address;

import com.stripe.android.ui.core.R;

/* loaded from: classes6.dex */
public enum NameType {
    area(R.string.address_label_hk_area),
    cedex(R.string.address_label_cedex),
    city(R.string.address_label_city),
    country(R.string.address_label_country),
    county(R.string.address_label_county),
    department(R.string.address_label_department),
    district(R.string.address_label_district),
    do_si(R.string.address_label_kr_do_si),
    eircode(R.string.address_label_ie_eircode),
    emirate(R.string.address_label_ae_emirate),
    island(R.string.address_label_island),
    neighborhood(R.string.address_label_neighborhood),
    oblast(R.string.address_label_oblast),
    parish(R.string.address_label_bb_jm_parish),
    pin(R.string.address_label_in_pin),
    post_town(R.string.address_label_post_town),
    postal(R.string.address_label_postal_code),
    prefecture(R.string.address_label_jp_prefecture),
    province(R.string.address_label_province),
    state(R.string.address_label_state),
    suburb(R.string.address_label_suburb),
    suburb_or_city(R.string.address_label_au_suburb_or_city),
    townland(R.string.address_label_ie_townland),
    village_township(R.string.address_label_village_township),
    zip(R.string.address_label_zip_code);
    
    private final int stringResId;

    NameType(int i11) {
        this.stringResId = i11;
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}