package com.plaid.link.result;

import com.plaid.link.result.LinkErrorCode;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkErrorCode$Companion$jsonToObject$2 extends u implements a<Map<String, ? extends LinkErrorCode>> {
    public static final LinkErrorCode$Companion$jsonToObject$2 INSTANCE = new LinkErrorCode$Companion$jsonToObject$2();

    public LinkErrorCode$Companion$jsonToObject$2() {
        super(0);
    }

    @Override // h00.a
    public final Map<String, ? extends LinkErrorCode> invoke() {
        Map<String, ? extends LinkErrorCode> l11;
        LinkErrorCode.InvalidRequest.MISSING_FIELDS missing_fields = LinkErrorCode.InvalidRequest.MISSING_FIELDS.INSTANCE;
        LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS unknown_fields = LinkErrorCode.InvalidRequest.UNKNOWN_FIELDS.INSTANCE;
        LinkErrorCode.InvalidRequest.INVALID_FIELD invalid_field = LinkErrorCode.InvalidRequest.INVALID_FIELD.INSTANCE;
        LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION invalid_configuration = LinkErrorCode.InvalidRequest.INVALID_CONFIGURATION.INSTANCE;
        LinkErrorCode.InvalidRequest.INVALID_BODY invalid_body = LinkErrorCode.InvalidRequest.INVALID_BODY.INSTANCE;
        LinkErrorCode.InvalidRequest.INVALID_HEADERS invalid_headers = LinkErrorCode.InvalidRequest.INVALID_HEADERS.INSTANCE;
        LinkErrorCode.InvalidRequest.NOT_FOUND not_found = LinkErrorCode.InvalidRequest.NOT_FOUND.INSTANCE;
        LinkErrorCode.InvalidRequest.SANDBOX_ONLY sandbox_only = LinkErrorCode.InvalidRequest.SANDBOX_ONLY.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_API_KEYS invalid_api_keys = LinkErrorCode.InvalidInput.INVALID_API_KEYS.INSTANCE;
        LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT unauthorized_environment = LinkErrorCode.InvalidInput.UNAUTHORIZED_ENVIRONMENT.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN invalid_access_token = LinkErrorCode.InvalidInput.INVALID_ACCESS_TOKEN.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN invalid_public_token = LinkErrorCode.InvalidInput.INVALID_PUBLIC_TOKEN.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_PRODUCTS invalid_products = LinkErrorCode.InvalidInput.INVALID_PRODUCTS.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID invalid_account_id = LinkErrorCode.InvalidInput.INVALID_ACCOUNT_ID.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_INSTITUTION invalid_institution = LinkErrorCode.InvalidInput.INVALID_INSTITUTION.INSTANCE;
        LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS too_many_verification_attempts = LinkErrorCode.InvalidInput.TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
        LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS incorrect_deposit_amounts = LinkErrorCode.InvalidInput.INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
        LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED user_permission_revoked = LinkErrorCode.InvalidInput.USER_PERMISSION_REVOKED.INSTANCE;
        LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS unauthorized_route_access = LinkErrorCode.InvalidInput.UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
        LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED direct_integration_not_enabled = LinkErrorCode.InvalidInput.DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN invalid_link_token = LinkErrorCode.InvalidInput.INVALID_LINK_TOKEN.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN invalid_processor_token = LinkErrorCode.InvalidInput.INVALID_PROCESSOR_TOKEN.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN invalid_audit_copy_token = LinkErrorCode.InvalidInput.INVALID_AUDIT_COPY_TOKEN.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT invalid_stripe_account = LinkErrorCode.InvalidInput.INVALID_STRIPE_ACCOUNT.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS invalid_credential_fields = LinkErrorCode.InvalidInput.INVALID_CREDENTIAL_FIELDS.INSTANCE;
        LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE product_unavailable = LinkErrorCode.InvalidInput.PRODUCT_UNAVAILABLE.INSTANCE;
        LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID invalid_webhook_verification_key_id = LinkErrorCode.InvalidInput.INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
        LinkErrorCode.RateLimit.ACCOUNTS_LIMIT accounts_limit = LinkErrorCode.RateLimit.ACCOUNTS_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.ADDITION_LIMIT addition_limit = LinkErrorCode.RateLimit.ADDITION_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.AUTH_LIMIT auth_limit = LinkErrorCode.RateLimit.AUTH_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.IDENTITY_LIMIT identity_limit = LinkErrorCode.RateLimit.IDENTITY_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.BALANCE_LIMIT balance_limit = LinkErrorCode.RateLimit.BALANCE_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.ITEM_GET_LIMIT item_get_limit = LinkErrorCode.RateLimit.ITEM_GET_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.RATE_LIMIT rate_limit = LinkErrorCode.RateLimit.RATE_LIMIT.INSTANCE;
        LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT transactions_limit = LinkErrorCode.RateLimit.TRANSACTIONS_LIMIT.INSTANCE;
        LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR internal_server_error = LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE;
        LinkErrorCode.ApiError.PLANNED_MAINTENANCE planned_maintenance = LinkErrorCode.ApiError.PLANNED_MAINTENANCE.INSTANCE;
        LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS insufficient_credentials = LinkErrorCode.ItemError.INSUFFICIENT_CREDENTIALS.INSTANCE;
        LinkErrorCode.ItemError.INVALID_CREDENTIALS invalid_credentials = LinkErrorCode.ItemError.INVALID_CREDENTIALS.INSTANCE;
        LinkErrorCode.ItemError.INVALID_MFA invalid_mfa = LinkErrorCode.ItemError.INVALID_MFA.INSTANCE;
        LinkErrorCode.ItemError.INVALID_SEND_METHOD invalid_send_method = LinkErrorCode.ItemError.INVALID_SEND_METHOD.INSTANCE;
        LinkErrorCode.ItemError.ITEM_LOCKED item_locked = LinkErrorCode.ItemError.ITEM_LOCKED.INSTANCE;
        LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED item_login_required = LinkErrorCode.ItemError.ITEM_LOGIN_REQUIRED.INSTANCE;
        LinkErrorCode.ItemError.ITEM_NO_ERROR item_no_error = LinkErrorCode.ItemError.ITEM_NO_ERROR.INSTANCE;
        LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED item_not_supported = LinkErrorCode.ItemError.ITEM_NOT_SUPPORTED.INSTANCE;
        LinkErrorCode.ItemError.USER_SETUP_REQUIRED user_setup_required = LinkErrorCode.ItemError.USER_SETUP_REQUIRED.INSTANCE;
        LinkErrorCode.ItemError.MFA_NOT_SUPPORTED mfa_not_supported = LinkErrorCode.ItemError.MFA_NOT_SUPPORTED.INSTANCE;
        LinkErrorCode.ItemError.NO_ACCOUNTS no_accounts = LinkErrorCode.ItemError.NO_ACCOUNTS.INSTANCE;
        LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS no_auth_accounts = LinkErrorCode.ItemError.NO_AUTH_ACCOUNTS.INSTANCE;
        LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS no_investment_accounts = LinkErrorCode.ItemError.NO_INVESTMENT_ACCOUNTS.INSTANCE;
        LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS no_liability_accounts = LinkErrorCode.ItemError.NO_LIABILITY_ACCOUNTS.INSTANCE;
        LinkErrorCode.ItemError.PRODUCT_NOT_READY product_not_ready = LinkErrorCode.ItemError.PRODUCT_NOT_READY.INSTANCE;
        LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED products_not_supported = LinkErrorCode.ItemError.PRODUCTS_NOT_SUPPORTED.INSTANCE;
        LinkErrorCode.ItemError.INSTANT_MATCH_FAILED instant_match_failed = LinkErrorCode.ItemError.INSTANT_MATCH_FAILED.INSTANCE;
        LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED product_not_enabled = LinkErrorCode.AssetReport.PRODUCT_NOT_ENABLED.INSTANCE;
        LinkErrorCode.AssetReport.DATA_UNAVAILABLE data_unavailable = LinkErrorCode.AssetReport.DATA_UNAVAILABLE.INSTANCE;
        LinkErrorCode.AssetReport.PRODUCT_NOT_READY product_not_ready2 = LinkErrorCode.AssetReport.PRODUCT_NOT_READY.INSTANCE;
        LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED asset_report_generation_failed = LinkErrorCode.AssetReport.ASSET_REPORT_GENERATION_FAILED.INSTANCE;
        LinkErrorCode.AssetReport.INVALID_PARENT invalid_parent = LinkErrorCode.AssetReport.INVALID_PARENT.INSTANCE;
        LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED insights_not_enabled = LinkErrorCode.AssetReport.INSIGHTS_NOT_ENABLED.INSTANCE;
        LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED insights_previously_not_enabled = LinkErrorCode.AssetReport.INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
        LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED recaptcha_required = LinkErrorCode.RecaptchaError.RECAPTCHA_REQUIRED.INSTANCE;
        LinkErrorCode.RecaptchaError.RECAPTCHA_BAD recaptcha_bad = LinkErrorCode.RecaptchaError.RECAPTCHA_BAD.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED bank_transfer_limit_exceeded = LinkErrorCode.BankTransferError.BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT bank_transfer_missing_origination_account = LinkErrorCode.BankTransferError.BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT bank_transfer_invalid_origination_account = LinkErrorCode.BankTransferError.BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED bank_transfer_account_blocked = LinkErrorCode.BankTransferError.BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS bank_transfer_insufficient_funds = LinkErrorCode.BankTransferError.BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE bank_transfer_not_cancellable = LinkErrorCode.BankTransferError.BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE bank_transfer_unsupported_account_type = LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
        LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT bank_transfer_unsupported_environment = LinkErrorCode.BankTransferError.BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
        LinkErrorCode.PaymentError.PAYMENT_BLOCKED payment_blocked = LinkErrorCode.PaymentError.PAYMENT_BLOCKED.INSTANCE;
        LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS payment_insufficient_funds = LinkErrorCode.PaymentError.PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
        LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT payment_invalid_recipient = LinkErrorCode.PaymentError.PAYMENT_INVALID_RECIPIENT.INSTANCE;
        LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE payment_invalid_reference = LinkErrorCode.PaymentError.PAYMENT_INVALID_REFERENCE.INSTANCE;
        LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE payment_invalid_schedule = LinkErrorCode.PaymentError.PAYMENT_INVALID_SCHEDULE.INSTANCE;
        LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE incorrect_oauth_nonce = LinkErrorCode.OAuthError.INCORRECT_OAUTH_NONCE.INSTANCE;
        LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN incorrect_link_token = LinkErrorCode.OAuthError.INCORRECT_LINK_TOKEN.INSTANCE;
        LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED oauth_state_id_already_processed = LinkErrorCode.OAuthError.OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
        LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID invalid_deposit_switch_id = LinkErrorCode.DepositSwitchError.INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND deposit_switch_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND deposit_switch_token_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT deposit_switch_invalid_account = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND deposit_switch_valid_auth_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND deposit_switch_valid_identity_not_found = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
        LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED deposit_switch_already_completed = LinkErrorCode.DepositSwitchError.DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
        LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED sandbox_product_not_enabled = LinkErrorCode.SandboxError.SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
        LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID sandbox_webhook_invalid = LinkErrorCode.SandboxError.SANDBOX_WEBHOOK_INVALID.INSTANCE;
        LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID sandbox_bank_transfer_event_transition_invalid = LinkErrorCode.SandboxError.SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
        LinkErrorCode.InstitutionError.INSTITUTION_DOWN institution_down = LinkErrorCode.InstitutionError.INSTITUTION_DOWN.INSTANCE;
        LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING institution_not_responding = LinkErrorCode.InstitutionError.INSTITUTION_NOT_RESPONDING.INSTANCE;
        LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE institution_not_available = LinkErrorCode.InstitutionError.INSTITUTION_NOT_AVAILABLE.INSTANCE;
        LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED institution_no_longer_supported = LinkErrorCode.InstitutionError.INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
        l11 = s0.l(v.a(missing_fields.getJson(), missing_fields), v.a(unknown_fields.getJson(), unknown_fields), v.a(invalid_field.getJson(), invalid_field), v.a(invalid_configuration.getJson(), invalid_configuration), v.a(invalid_body.getJson(), invalid_body), v.a(invalid_headers.getJson(), invalid_headers), v.a(not_found.getJson(), not_found), v.a(sandbox_only.getJson(), sandbox_only), v.a(invalid_api_keys.getJson(), invalid_api_keys), v.a(unauthorized_environment.getJson(), unauthorized_environment), v.a(invalid_access_token.getJson(), invalid_access_token), v.a(invalid_public_token.getJson(), invalid_public_token), v.a(invalid_products.getJson(), invalid_products), v.a(invalid_account_id.getJson(), invalid_account_id), v.a(invalid_institution.getJson(), invalid_institution), v.a(too_many_verification_attempts.getJson(), too_many_verification_attempts), v.a(incorrect_deposit_amounts.getJson(), incorrect_deposit_amounts), v.a(user_permission_revoked.getJson(), user_permission_revoked), v.a(unauthorized_route_access.getJson(), unauthorized_route_access), v.a(direct_integration_not_enabled.getJson(), direct_integration_not_enabled), v.a(invalid_link_token.getJson(), invalid_link_token), v.a(invalid_processor_token.getJson(), invalid_processor_token), v.a(invalid_audit_copy_token.getJson(), invalid_audit_copy_token), v.a(invalid_stripe_account.getJson(), invalid_stripe_account), v.a(invalid_credential_fields.getJson(), invalid_credential_fields), v.a(product_unavailable.getJson(), product_unavailable), v.a(invalid_webhook_verification_key_id.getJson(), invalid_webhook_verification_key_id), v.a(accounts_limit.getJson(), accounts_limit), v.a(addition_limit.getJson(), addition_limit), v.a(auth_limit.getJson(), auth_limit), v.a(identity_limit.getJson(), identity_limit), v.a(balance_limit.getJson(), balance_limit), v.a(item_get_limit.getJson(), item_get_limit), v.a(rate_limit.getJson(), rate_limit), v.a(transactions_limit.getJson(), transactions_limit), v.a(internal_server_error.getJson(), internal_server_error), v.a(planned_maintenance.getJson(), planned_maintenance), v.a(insufficient_credentials.getJson(), insufficient_credentials), v.a(invalid_credentials.getJson(), invalid_credentials), v.a(invalid_mfa.getJson(), invalid_mfa), v.a(invalid_send_method.getJson(), invalid_send_method), v.a(item_locked.getJson(), item_locked), v.a(item_login_required.getJson(), item_login_required), v.a(item_no_error.getJson(), item_no_error), v.a("item-no-error", item_no_error), v.a(item_not_supported.getJson(), item_not_supported), v.a(user_setup_required.getJson(), user_setup_required), v.a(mfa_not_supported.getJson(), mfa_not_supported), v.a(no_accounts.getJson(), no_accounts), v.a(no_auth_accounts.getJson(), no_auth_accounts), v.a("no-depository-accounts", no_auth_accounts), v.a(no_investment_accounts.getJson(), no_investment_accounts), v.a(no_liability_accounts.getJson(), no_liability_accounts), v.a(product_not_ready.getJson(), product_not_ready), v.a(products_not_supported.getJson(), products_not_supported), v.a(instant_match_failed.getJson(), instant_match_failed), v.a(product_not_enabled.getJson(), product_not_enabled), v.a(data_unavailable.getJson(), data_unavailable), v.a(product_not_ready2.getJson(), product_not_ready2), v.a(asset_report_generation_failed.getJson(), asset_report_generation_failed), v.a(invalid_parent.getJson(), invalid_parent), v.a(insights_not_enabled.getJson(), insights_not_enabled), v.a(insights_previously_not_enabled.getJson(), insights_previously_not_enabled), v.a(recaptcha_required.getJson(), recaptcha_required), v.a(recaptcha_bad.getJson(), recaptcha_bad), v.a(bank_transfer_limit_exceeded.getJson(), bank_transfer_limit_exceeded), v.a(bank_transfer_missing_origination_account.getJson(), bank_transfer_missing_origination_account), v.a(bank_transfer_invalid_origination_account.getJson(), bank_transfer_invalid_origination_account), v.a(bank_transfer_account_blocked.getJson(), bank_transfer_account_blocked), v.a(bank_transfer_insufficient_funds.getJson(), bank_transfer_insufficient_funds), v.a(bank_transfer_not_cancellable.getJson(), bank_transfer_not_cancellable), v.a(bank_transfer_unsupported_account_type.getJson(), bank_transfer_unsupported_account_type), v.a(bank_transfer_unsupported_environment.getJson(), bank_transfer_unsupported_environment), v.a(payment_blocked.getJson(), payment_blocked), v.a(payment_insufficient_funds.getJson(), payment_insufficient_funds), v.a(payment_invalid_recipient.getJson(), payment_invalid_recipient), v.a(payment_invalid_reference.getJson(), payment_invalid_reference), v.a(payment_invalid_schedule.getJson(), payment_invalid_schedule), v.a(incorrect_oauth_nonce.getJson(), incorrect_oauth_nonce), v.a(incorrect_link_token.getJson(), incorrect_link_token), v.a(oauth_state_id_already_processed.getJson(), oauth_state_id_already_processed), v.a(invalid_deposit_switch_id.getJson(), invalid_deposit_switch_id), v.a(deposit_switch_not_found.getJson(), deposit_switch_not_found), v.a(deposit_switch_token_not_found.getJson(), deposit_switch_token_not_found), v.a(deposit_switch_invalid_account.getJson(), deposit_switch_invalid_account), v.a(deposit_switch_valid_auth_not_found.getJson(), deposit_switch_valid_auth_not_found), v.a(deposit_switch_valid_identity_not_found.getJson(), deposit_switch_valid_identity_not_found), v.a(deposit_switch_already_completed.getJson(), deposit_switch_already_completed), v.a(sandbox_product_not_enabled.getJson(), sandbox_product_not_enabled), v.a(sandbox_webhook_invalid.getJson(), sandbox_webhook_invalid), v.a(sandbox_bank_transfer_event_transition_invalid.getJson(), sandbox_bank_transfer_event_transition_invalid), v.a(institution_down.getJson(), institution_down), v.a(institution_not_responding.getJson(), institution_not_responding), v.a(institution_not_available.getJson(), institution_not_available), v.a(institution_no_longer_supported.getJson(), institution_no_longer_supported));
        return l11;
    }
}