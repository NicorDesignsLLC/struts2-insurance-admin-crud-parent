package com.nicordesigns.struts2.insurance.utils;


public interface SQLKeyConstants 
{
	String DISTRIBUTOR_CODES_SQL = "distributorCodes.sql";
	String DISTRIBUTOR_CODES_MYSQL = "distributorCodesMySQL.sql";
	String MANUFACTURER_CODES_SQL = "manufacturerCodes.sql";
	String CASKET_COLLECTIONS_SQL = "casketCollections.sql";
	String CASKET_TYPES_SQL = "casketTypes.sql";
	String CASKET_MODEL_DESCRIPTION_SQL = "casketModelDescription.sql";
	String INSERT_CASKET_INFO = "insertCasketInfo.sql";
	String INSERT_MM_INFO = "insertMmInfo.sql";
	String DELETE_MM_INFO = "deleteMmInfo.sql";
	String DELETE_MM_INFO_MYSQL = "deleteMmInfoMySQL.sql";
	
	String GET_MM_INFO = "getMmInfo.sql";
	String GET_MM_INFO_MYSQL = "getMmInfoMySQL.sql";
	
	String GET_FEI_INFO = "getFeiInfo.sql";
	String DELETE_FEI_INFO = "deleteFeiInfo.sql";
	String DELETE_FEI_INFO_MYSQL = "deleteFeiInfoMySQL.sql";
	
	String INSERT_FEI_INFO = "insertFeiInfo.sql";
	String DELETE_CASKET_INFO = "deleteCasketInfo.sql";
	String DELETE_CASKET_INFO_MYSQL = "deleteCasketInfoMySQL.sql";
	
	String GET_CASKET_INFO = "getCasketInfo.sql";
	String FH_AGENT_ASSOC_SQL = "fhAgentAssoc.sql";
	String MCF_DESC_SQL = "mcfDesc.sql";
	String MCF_DESC_FR_SQL = "mcfDescFr.sql";
	String PENDING_APP_SQL = "pendingApplication.sql";
	String PENDING_WEBID_APP_SQL = "pendingWebIdApplication.sql";
    String GET_AGENT_SPECIFIC_APPCOUNT_SQL = "getAgentSpecificAppCount.sql";
    String GET_APPCOUNT_SQL = "getAppCount.sql";
    String GET_APPCOUNT_MYSQL = "getAppCountMySQL.sql";
    
    String GET_ANNUITANTSEQ_SQL = "getAnnuitantSinSeq.sql";
    String GET_ANNUITANTSEQ_MYSQL1 = "getAnnuitantSinSeqMySQL1.sql";
    String GET_ANNUITANTSEQ_MYSQL2 = "getAnnuitantSinSeqMySQL2.sql";
    
    String MCF_DESC_LIST_SQL = "mcfDescList.sql";
    String MIN_MAX_AGE_PRODUCT_LIST_SQL = "minMaxAgeProductList.sql";
    String MIN_MAX_AGE_PRODUCT_LIST_MYSQL = "minMaxAgeProductListMySQL.sql";
    
    String SELECT_PRODUCT_SQL = "selectProduct.sql";
    String SELECT_PRODUCT_MYSQL = "selectProductMYSQL.sql";
	
    String SELECT_PROVINCES_SQL = "selectProvinces.sql";
	String SELECT_PROVINCES_FR_SQL = "selectProvincesFr.sql";
	
	String SELECT_PROVINCES_MYSQL = "selectProvincesMySQL.sql";
	String SELECT_PROVINCES_FR_MYSQL = "selectProvincesFrMySQL.sql";
	
	String SELECT_LPR_PROVINCES_SQL = "getAgentLicensedLprProvinces.sql";
	String SELECT_LPR_PROVINCES_FR_SQL = "getAgentLicensedLprProvincesFr.sql";
	String SELECT_LPR_PROVINCES_MYSQL = "getAgentLicensedLprProvincesMySQL.sql";
	String SELECT_LPR_PROVINCES_FR_MYSQL = "getAgentLicensedLprProvincesFrMySQL.sql";
	
	String ACC_TYPE_SQL = "accType.sql";
	String ACC_TYPE_MYSQL = "accTypeMySQL.sql";
	
	String ACC_VALUE_SQL = "accTValue.sql";
	String ACC_VALUE_MYSQL = "accTValueMySQL.sql";
	
	String FUN_HOMEINFO_SQL = "funHomeInfo.sql";
	String FUN_HOMEINFO_MYSQL = "funHomeInfoMySQL.sql";
	
	String SIN_EXISTS_SQL = "SINExists.sql";
	String SAVE_EXIT_ANNUITANT_INFO_SQL = "saveExitAnnInfo.sql";
	String SAVE_EXIT_ANNUITANT_INFO_MYSQL = "saveExitAnnInfoMySQL.sql";
	
	String SELECT_ANNUITANT_INFO_SQL = "selectAnnuitant.sql";
	String SELECT_ANNUITANT_INFO_MYSQL = "selectAnnuitantMySQL.sql";
	
	String UPDATE_FUNERAL_HOME_SQL = "updateFuneralHome.sql";
	String UPDATE_ANNUITANT_INFO_SQL = "updateAnnuitantInfo.sql";
	String UPDATE_ANNUITANT_INFO_MYSQL = "updateAnnuitantInfoMySQL.sql";
	
    String UPDATE_ANNUITANT_INFO_FOR_AGE_CHANGE_SQL = "updateAnnuitantInfoForAgeChange.sql";
    String CLEAR_ANNUITANT_FOR_FUNERAL_INFO_SQL = "clearAnnuitantForFuneralInfo.sql";
	String CLEAR_ANNUITANT_SQL = "clearAnnuitant.sql";
	String CLEAR_ANNUITANT_MYSQL = "clearAnnuitantMySQL.sql";
	
	String UPDATE_ANNUITANT_INFO_FOR_PRODUCT_SELECT_SQL = "updateAnnuitantInfoForProductSelect.sql";
	String UPDATE_PAYMENT_METHOD_SQL = "updatePaymentMethod.sql";
    String UPDATE_PAYOR_SQL = "updatePayor.sql";

    String INSERT_CCPAYMENT_INFO_SQL="insertCCPaymentInfo.sql";
    String UPDATE_CCPAYMENT_INFO_SQL="updateCCPaymentInfo.sql";
    String UPDATE_HEALTH_QUESTIONS_SQL = "updateHealthQuestions.sql";
	String FINAL_SUBMIT_SQL = "finalSubmit.sql";
	String UPDATE_SPECIAL_INSTRUCTIONS_SQL = "updateSpecialInstructions.sql";
	String DELETE_ANNUITANT_SQL = "deleteAnnuitant.sql";
	String DELETE_ANNUITANT_MYSQL = "deleteAnnuitantMySQL.sql";
	
    String DELETE_PAYMENTINFO_SQL = "deletePaymentInfo.sql";
    String DELETE_PAYMENTINFO_MYSQL = "deletePaymentInfoMySQL.sql";
    
    String PRINTED_STATUS_SQL = "printedStatus.sql";
	String MAIL_SEND_STATUS_SQL = "mailSendStatus.sql";
	String UPDATE_FAMILY_SIDE_INFO_SQL = "updateFuneralInfo.sql";
	String UPDATE_PAYMENT_SELECTION_SQL = "updatePaymentSelection.sql";
	String PRODUCT_MODEL_SQL = "pdtModel.sql";
	String PRODUCT_MODEL_MYSQL = "pdtModelMySQL.sql";
	
    String FH_CCMAIL_SQL = "fhCCMail.sql";
    String AGENT_CCMAIL_SQL = "agentCCMail.sql";
    String CHECK_CC_OPTION_SQL = "checkCCOption.sql";
    String CHECK_PREV_PAYMENT_OPTION_SQL="checkPrevPaymentOption.sql";
    String GET_ID_METHODS_SQL="getIdMethods.sql";
    String GET_CCPAYMENT_INFO="getCCPaymentInfo.sql";
    String CC_TYPES_LIST_SQL="getCreditCardTypes.sql";
    String GET_PACKAGE_LIST="getPackageList.sql";
    String GET_PACKAGE_LIST_MYSQL="getPackageListMySQL.sql";
    String UPDATE_FEI_AMT="updateFeiAmt.sql";
    String GET_FINAL_EXPENSE_ITEMS="getFinalExpenseItems.sql";
	String GET_FINAL_EXPENSE_ITEMS_FR = "getFinalExpenseItemsFr.sql";
    String SELECT_MM_CLIENTS ="selectMmClients.sql";

    String GET_PDF_SECTION_IDS="getPdfSectionIds.sql";
    String GET_JOINT_PDF_TITLE="getJointPdfTitle.sql";
    String GET_PMT_SECTION_ELEMENTS="getPmtSectionElements.sql";
    String GET_OTHER_SECTION_ELEMENTS="getOtherSectionElements.sql";

    public static final String DELETE_FROM_QUEUE_SQL = "deleteFromQueue.sql";    
    public static final String GET_ANNUITANT_TRX_SQL = "selectTrx.sql"; 
    public static final String SAVE_TO_QUEUE_SQL = "saveToQueue.sql";
    public static final String SAVE_TO_QUEUE_DUP_SQL = "saveToQueueDuplicate.sql";
    public static final String UNSENT_QUEUED_ENTRIES_SQL ="unsentQueuedEntries.sql";
    public static final String QUEUE_SELECT_SQL ="selectQueue.sql";
    public static final String UPDATE_QUEUED_SENT_SQL = "updateQueuedSent.sql";
    public static final String UPDATE_CCNUMBER_FOR_QUEUED_SENT_SQL = "updateCCNumberForQueuedSent.sql";
    public static final String NEXT_QUEUE_ID_SQL = "nextQueueId.sql";
    public static final String QUEUED_ENTRIES_SQL = "queuedEntries.sql";
    public static final String QUEUE_RECORD_DATA_SQL = "queueRecordData.sql";
    public static final String WRITING_AGENT_NUMBER_SQL = "writingAgentNumber.sql";
    public static final String POS_SQL = "pos.sql";
    public static final String PROVINCE_CODE_SQL = "provinceCode.sql";
    public static final String AGENT_OPTIONS_SQL = "agentOptions.sql";
    public static final String AGENT_OPTIONS_MYSQL = "agentOptionsMySQL.sql";
    
    public static final String FH_PROVINCE_ID_SQL = "fhProvinceId.sql";
    public static final String FH_PROVINCE_CODE_SQL = "fhProvinceCode.sql";
    public static final String AGENT_PROVINCE_CODE_SQL = "agentProvinceCode.sql";
    public static final String AGENT_PROVINCE_ID_SQL = "agentProvinceId.sql";
    public static final String AGENT_PROVINCE_ID_MYSQL = "agentProvinceIdMySQL.sql";
    
    public static final String SELECT_COMMON_USE_SQL = "selectCommonUse.sql";
    public static final String GET_PLAN_CODE_TYPE_SQL = "getPlanCodeType.sql";
    public static final String UPDATE_PAYMODE_SQL = "updatePaymode.sql";
  
    public static final String CORRESP_PREM_TABLE_SQL ="getPremiumTable.sql";
    public static final String FUNHOME_ID_SQL = "getFunHomeId.sql";
   
    public static final String GET_ABR_VENDOR_SQL ="getAbrVendor.sql";
    public static final String GET_AGENT_ENTITY_SQL = "getAgentEntity.sql";
    public static final String GET_AGENT_ENTITY_MYSQL = "getAgentEntityMySQL.sql";
    
    
    public static final String GET_PDF_LIST_SQL = "getPdfList.sql";
    public static final String GET_APPS_LIST_SQL = "getAppsList.sql";
    public static final String GET_APPS_LIST_AUTOSUBMIT_SQL = "getAppsListAutosubmit.sql";
    public static final String GET_APPS_LIST_COUNT_SQL = "getAppsListCount.sql";
    public static final String GET_APPS_LIST_STATUSES_SQL = "getAppsListStatuses.sql";
    
    public static final String GET_AUTOSUBMIT_STATUS_SQL = "getAutoSubmitStatus.sql";
    public static final String DELETE_AUTOSUBMT_STATUS = "deleteAutoSubmitStatus.sql";
    public static final String DELETE_AUTOSUBMT_STATUS_MYSQL = "deleteAutoSubmitStatusMySQL.sql";
    
    
	public static final String GET_ALIS_RELATIONSHIPS = "getAlisRelationships.sql";
	public static final String GET_ALIS_RELATIONSHIPS_FR_SQL = "getAlisRelationshipsFr.sql";

	public static final String GET_ALIS_RELATIONSHIPS_MYSQL = "getAlisRelationshipsMySQL.sql";
	public static final String GET_ALIS_RELATIONSHIPS_FR_MYSQL = "getAlisRelationshipsFrMySQL.sql";

	public static final String GET_ALIS_BENE_RELATIONSHIPS = "getAlisBeneRelationships.sql";
	public static final String GET_ALIS_BENE_RELATIONSHIPS_FR_SQL = "getAlisBeneRelationshipsFr.sql";
	
	public static final String GET_ALIS_BENE_RELATIONSHIPS_MYSQL = "getAlisBeneRelationshipsMySQL.sql";
	public static final String GET_ALIS_BENE_RELATIONSHIPS_FR_MYSQL = "getAlisBeneRelationshipsFrMySQL.sql";
	
	public static final String GET_ALIS_OCCUPATIONS = "getAlisOccupations.sql";
	public static final String GET_ALIS_OCCUPATIONS_MYSQL = "getAlisOccupationsMySQL.sql";
	
	public static final String GET_ALIS_OCCUPATIONS_FR_SQL = "getAlisOccupationsFr.sql";
	public static final String GET_ALIS_OCCUPATIONS_FR_MYSQL = "getAlisOccupationsFrMySQL.sql";
	
    
    String TP_FEGA_GI_PREM_SQL = "timePayFEGA_GI_PREM.sql";
	String TP_FEGA_IP_PREM_SQL = "timePayFEGA_IP_PREM.sql";
	String TP_FPGA_GISI_PREM_SQL = "timePayFPGA_GISI_PREM.sql";
	String TP_FPGA_IP_PREM_SQL = "timePayFPGA_IP_PREM.sql";
	String TP_GFPA_PREM_SQL = "timePayGFPA_PREM.sql";
	String TP_GFP_PREM_SQL = "timePayGFP_PREM.sql";
	
	String TP_GFP_SIGI_PREM_SQL = "timePayGFP_SIGI_PREM.sql";
	String TP_SPIA_GIIB_PREM_SQL = "timePaySPIA_GIIB_PREM.sql";
	
    String TP_GIIB_PREM_SQL = "timePayGIIB_PREM.sql";
    String TP_QUEBEC_PREM_SQL = "timePayQUEBEC_PREM.sql";
    String TP_FPIA_BASE_PREM_SQL = "timePayFPIA_BASE_PREM.sql";
    String TP_FPIA_PIGI_PREM_SQL = "timePayFPIA_PIGI_PREM.sql";
    String TP_FPIA_RIDER_PREM_SQL = "riderPayFPIA_RIDER_PREM.sql";
    String TP_FPGA_ADDITION_SQL = "valueAddedFPGA_ADDITION.sql";
    String TP_FEGA_ADDITION_SQL = "valueAddedFEGA_ADDITION.sql";
    String TP_DTA_ADDITION_SQL = "valueAddedDTA_ADDITION.sql";
    String TP_GFD_ADDITION_SQL = "valueAddedGFD_ADDITION.sql";
    String TP_FPGA_NONPLUS_ADDITION_SQL = "valueAddedFPGA_NONPLUS_ADDITION.sql";
    String TP_GFPIA_BASE_PREM_SQL = "timePayGFPIA_BASE_PREM.sql";
    String TP_FPGA_PLUS_1P_PREM_SQL = "timePayFPGA_PLUS_1P_PREM.sql";
	String TP_FEIA_PREM_SQL = "timePayFEIA_PREM.sql";



    String FETCH_TAX_SQL = "fetchTax.sql";
	String MCF_VALUE_SQL = "mcfValue.sql";
	String MCF_DESC1_SQL = "mcfdesc.sql";
	String AGENT_GROUP_OR_INDIVIDUAL_SQL = "agentGroupORIndividual.sql";
	String AGENT_GROUP_OR_INDIVIDUAL_MYSQL = "agentGroupORIndividual.sql";
	
	String PROVIENCE_NAME_SQL = "provinceName.sql";
    String AGENT_PROVIENCE_NAME_SQL = "agentProvinceName.sql";
    String AGENT_PROVIENCE_NAME_MYSQL = "agentProvinceNameMySQL.sql";
    

    String TP_ONEYEAR="ONEYEAR";
	String TP_TWOYEAR="TWOYEAR";
	String TP_THREEYEAR="THREEYEAR";
	String TP_FOURYEAR="FOURYEAR";
	String TP_FIVEYEAR="FIVEYEAR";
	String TP_TENYEAR="TENYEAR";
    String TP_FIFTEENYEAR="FIFTEENYEAR";
    String TP_TWENTYYEAR="TWENTYYEAR";
    public static final int STALECONN_MAX_RETRIES = 3;

    String SELECT_PG_HOST="selectPGHost.sql";
    
    String SELECT_ENROLLERS="selectEnrollers.sql";
    String SELECT_ENROLLERS_MYSQL="selectEnrollersMySQL.sql";
    
    String SELECT_ENROLLERSFH="selectEnrollersFh.sql";
    String SELECT_ENROLLERSFH_MYSQL="selectEnrollersFhMySQL.sql";
    
    String SELECT_FHS="selectFhs.sql";
    String SELECT_FHS_MYSQL="selectFhsMySQL.sql";
    
    String SELECT_FHSAGENTS="selectFhsAgents.sql";
    String SELECT_FHSAGENTS_MYSQL="selectFhsAgentsMySQL.sql";
    
	String GET_CC_TYPE_SQL = "getCcType.sql";
	String GET_RATECALC_INFO_SQL = "getRateCalcInfo.sql";
	String GET_PPP_FOR_TPF_SQL = "getPppForTpf.sql";
	String GET_OCCUPATION_SQL = "getOccupation.sql";
	String GET_RELATIONSHIP_SQL = "getRelationship.sql";
	String GET_BENEFICIARY_RELATIONSHIP_SQL = "getBeneficiaryRelationship.sql";
	String GET_FH_NATURE_OF_BUSINESS_SQL = "getFhNatureOfBusiness.sql";
	String GET_FH_NATURE_OF_BUSINESS_MYSQL = "getFhNatureOfBusinessMySQL.sql";
	
	String GET_NATURE_OF_BUSINESS_TYPE_SQL = "getNatureOfBusinessType.sql";
	String GET_NATURE_OF_BUSINESS_TYPE_MYSQL = "getNatureOfBusinessTypeMySQL.sql";
	
	String GET_EAS_CHANGE_SQL = "getEasChange.sql";
	String GET_EXISTING_POLICY_SQL = "getExistingPolicyInfo.sql";
	String UPDATE_SP_ATP_SQL = "updateSpAtp.sql";
	String UPDATE_LPR_SQL = "updateLpr.sql";
	String UPDATE_ANNUITANT_INFO_FOR_PRODUCT_SELECT_ATP_SQL = "updateAnnuitantInfoForProductSelectAtp.sql";
	String UPDATE_ANNUITANT_INFO_FOR_PRODUCT_SELECT_ATP_MYSQL = "updateAnnuitantInfoForProductSelectAtpMySQL.sql";
	
	String IS_AGENT_LICENSED_LPR = "isAgentLicensedLpr.sql";
	String IS_AGENT_LICENSED_LPR_MYSQL = "isAgentLicensedLpr.sql";
	
	String IS_AGENT_LICENSED_LPR_PROVINCE = "isAgentLicensedLprProvince.sql";
	String IS_AGENT_LICENSED_LPR_PROVINCE_MYSQL = "isAgentLicensedLprProvinceMySQL.sql";
	
	String MIN_MAX_AMOUNT_LPR_SQL = "getMinMaxLprAmt.sql";
	String MIN_MAX_AMOUNT_LPR_MYSQL = "getMinMaxLprAmtMySQL.sql";
	
	
}
