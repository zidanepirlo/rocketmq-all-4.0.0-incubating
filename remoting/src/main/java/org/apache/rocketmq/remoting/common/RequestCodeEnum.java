package org.apache.rocketmq.remoting.common;

public enum RequestCodeEnum {

    SEND_MESSAGE(10,"SEND_MESSAGE"),
    PULL_MESSAGE(11,"PULL_MESSAGE"),
    QUERY_MESSAGE(12,"QUERY_MESSAGE"),
    QUERY_BROKER_OFFSET(13,"QUERY_BROKER_OFFSET"),
    QUERY_CONSUMER_OFFSET(14,"QUERY_CONSUMER_OFFSET"),
    UPDATE_CONSUMER_OFFSET(15,"UPDATE_CONSUMER_OFFSET"),
    UPDATE_AND_CREATE_TOPIC(17,"UPDATE_AND_CREATE_TOPIC"),
    GET_ALL_TOPIC_CONFIG(21,"GET_ALL_TOPIC_CONFIG"),
    GET_TOPIC_CONFIG_LIST(22,"GET_TOPIC_CONFIG_LIST"),
    GET_TOPIC_NAME_LIST(23,"GET_TOPIC_NAME_LIST"),
    UPDATE_BROKER_CONFIG(25,"UPDATE_BROKER_CONFIG"),
    TRIGGER_DELETE_FILES(27,"TRIGGER_DELETE_FILES"),
    GET_BROKER_RUNTIME_INFO(28,"GET_BROKER_RUNTIME_INFO"),
    SEARCH_OFFSET_BY_TIMESTAMP(29,"SEARCH_OFFSET_BY_TIMESTAMP"),
    GET_MAX_OFFSET(30,"GET_MAX_OFFSET"),
    GET_MIN_OFFSET(31,"GET_MIN_OFFSET"),
    GET_EARLIEST_MSG_STORETIME(32,"GET_EARLIEST_MSG_STORETIME"),
    VIEW_MESSAGE_BY_ID(33,"VIEW_MESSAGE_BY_ID"),
    HEART_BEAT(34,"HEART_BEAT"),
    UNREGISTER_CLIENT(35,"UNREGISTER_CLIENT"),
    CONSUMER_SEND_MSG_BACK(36,"CONSUMER_SEND_MSG_BACK"),
    END_TRANSACTION(37,"END_TRANSACTION"),
    GET_CONSUMER_LIST_BY_GROUP(38,"GET_CONSUMER_LIST_BY_GROUP"),
    CHECK_TRANSACTION_STATE(39,"CHECK_TRANSACTION_STATE"),
    NOTIFY_CONSUMER_IDS_CHANGED(40,"NOTIFY_CONSUMER_IDS_CHANGED"),
    LOCK_BATCH_MQ(41,"LOCK_BATCH_MQ"),
    UNLOCK_BATCH_MQ(42,"UNLOCK_BATCH_MQ"),
    GET_ALL_CONSUMER_OFFSET(43,"GET_ALL_CONSUMER_OFFSET"),
    GET_ALL_DELAY_OFFSET(45,"GET_ALL_DELAY_OFFSET"),
    PUT_KV_CONFIG(100,"PUT_KV_CONFIG"),
    GET_KV_CONFIG(101,"GET_KV_CONFIG"),
    DELETE_KV_CONFIG(102,"DELETE_KV_CONFIG"),
    REGISTER_BROKER(103,"REGISTER_BROKER"),
    UNREGISTER_BROKER(104,"UNREGISTER_BROKER"),
    GET_ROUTEINTO_BY_TOPIC(105,"GET_ROUTEINTO_BY_TOPIC"),
    GET_BROKER_CLUSTER_INFO(106,"GET_BROKER_CLUSTER_INFO"),
    UPDATE_AND_CREATE_SUBSCRIPTIONGROUP(200,"UPDATE_AND_CREATE_SUBSCRIPTIONGROUP"),
    GET_ALL_SUBSCRIPTIONGROUP_CONFIG(201,"GET_ALL_SUBSCRIPTIONGROUP_CONFIG"),
    GET_CONSUMER_CONNECTION_LIST(203,"GET_CONSUMER_CONNECTION_LIST"),
    GET_PRODUCER_CONNECTION_LIST(204,"GET_PRODUCER_CONNECTION_LIST"),
    WIPE_WRITE_PERM_OF_BROKER(205,"WIPE_WRITE_PERM_OF_BROKER"),
    GET_ALL_TOPIC_LIST_FROM_NAMESERVER(206,"GET_ALL_TOPIC_LIST_FROM_NAMESERVER"),
    DELETE_SUBSCRIPTIONGROUP(207,"DELETE_SUBSCRIPTIONGROUP"),
    GET_CONSUME_STATS(208,"GET_CONSUME_STATS"),
    SUSPEND_CONSUMER(209,"SUSPEND_CONSUMER"),
    RESUME_CONSUMER(210,"RESUME_CONSUMER"),
    RESET_CONSUMER_OFFSET_IN_CONSUMER(211,"RESET_CONSUMER_OFFSET_IN_CONSUMER"),
    RESET_CONSUMER_OFFSET_IN_BROKER(212,"RESET_CONSUMER_OFFSET_IN_BROKER"),
    ADJUST_CONSUMER_THREAD_POOL(213,"ADJUST_CONSUMER_THREAD_POOL"),
    WHO_CONSUME_THE_MESSAGE(214,"WHO_CONSUME_THE_MESSAGE"),
    DELETE_TOPIC_IN_BROKER(215,"DELETE_TOPIC_IN_BROKER"),
    DELETE_TOPIC_IN_NAMESRV(216,"DELETE_TOPIC_IN_NAMESRV"),
    GET_KVLIST_BY_NAMESPACE(219,"GET_KVLIST_BY_NAMESPACE"),
    RESET_CONSUMER_CLIENT_OFFSET(220,"RESET_CONSUMER_CLIENT_OFFSET"),
    GET_CONSUMER_STATUS_FROM_CLIENT(221,"GET_CONSUMER_STATUS_FROM_CLIENT"),
    INVOKE_BROKER_TO_RESET_OFFSET(222,"INVOKE_BROKER_TO_RESET_OFFSET"),
    INVOKE_BROKER_TO_GET_CONSUMER_STATUS(223,"INVOKE_BROKER_TO_GET_CONSUMER_STATUS"),
    QUERY_TOPIC_CONSUME_BY_WHO(300,"QUERY_TOPIC_CONSUME_BY_WHO"),
    GET_TOPICS_BY_CLUSTER(224,"GET_TOPICS_BY_CLUSTER"),
    REGISTER_FILTER_SERVER(301,"REGISTER_FILTER_SERVER"),
    REGISTER_MESSAGE_FILTER_CLASS(302,"REGISTER_MESSAGE_FILTER_CLASS"),
    QUERY_CONSUME_TIME_SPAN(303,"QUERY_CONSUME_TIME_SPAN"),
    GET_SYSTEM_TOPIC_LIST_FROM_NS(304,"GET_SYSTEM_TOPIC_LIST_FROM_NS"),
    GET_SYSTEM_TOPIC_LIST_FROM_BROKER(305,"GET_SYSTEM_TOPIC_LIST_FROM_BROKER"),
    CLEAN_EXPIRED_CONSUMEQUEUE(306,"CLEAN_EXPIRED_CONSUMEQUEUE"),
    GET_CONSUMER_RUNNING_INFO(307,"GET_CONSUMER_RUNNING_INFO"),
    QUERY_CORRECTION_OFFSET(308,"QUERY_CORRECTION_OFFSET"),
    CONSUME_MESSAGE_DIRECTLY(309,"CONSUME_MESSAGE_DIRECTLY"),
    SEND_MESSAGE_V2(310,"SEND_MESSAGE_V2"),
    GET_UNIT_TOPIC_LIST(311,"GET_UNIT_TOPIC_LIST"),
    GET_HAS_UNIT_SUB_TOPIC_LIST(312,"GET_HAS_UNIT_SUB_TOPIC_LIST"),
    GET_HAS_UNIT_SUB_UNUNIT_TOPIC_LIST(313,"GET_HAS_UNIT_SUB_UNUNIT_TOPIC_LIST"),
    CLONE_GROUP_OFFSET(314,"CLONE_GROUP_OFFSET"),
    VIEW_BROKER_STATS_DATA(315,"VIEW_BROKER_STATS_DATA"),
    CLEAN_UNUSED_TOPIC(316,"CLEAN_UNUSED_TOPIC"),
    GET_BROKER_CONSUME_STATS(317,"GET_BROKER_CONSUME_STATS"),
    UPDATE_NAMESRV_CONFIG(318,"UPDATE_NAMESRV_CONFIG"),
    GET_NAMESRV_CONFIG(319,"GET_NAMESRV_CONFIG");


    private int code;

    private String desc;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private RequestCodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDesc(final int code){

        for(RequestCodeEnum requestCodeEnum:RequestCodeEnum.values()){
            if(requestCodeEnum.code == code){
                return requestCodeEnum.desc;
            }
        }
        return null;
    }

}
