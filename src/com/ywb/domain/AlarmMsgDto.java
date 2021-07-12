package com.ywb.domain;

/**
 * @Description: TODO
 * @author: Yiwenbin
 * @company: jovision.com
 * @create: 2021/7/7
 */

import java.util.Date;

/**
 * type deviceAlarmMessage struct {
 *     YstVersion                      int
 *     DeviceId                        string                          `json:"dguid"`      // 设备guid
 *     AlarmIdValue                    uint32
 *     AlarmId                         string                          `json:"aguid"`      // 报警guid
 *     AlarmStoreType                  uint8                           `json:"asln"`       // 报警解决方案，0本地报警，1云存储报警，2本地和云存储混合方案
 *     AlarmMsgType                    uint8                           `json:"amt"`        // 报警消息类型，0文本消息，1图片上传完成，2视频上传完成
 *     DeviceName                      string                          `json:"dname"`      // 设备名
 *     DeviceType                      uint16                          `json:"devtype"`    // 设备类型
 *     DeviceChannelNumber             uint16                          `json:"dcn"`        // 通道
 *     AlarmType                       uint16                          `json:"atype"`      // 报警类型
 *     ALarmTime                       string                          `json:"atss"`       // 报警时间
 *     AlarmPicURL                     string                          `json:"apicurl"`    // 图片url
 *     AlarmVideoURL                   string                          `json:"avdurl"`     // 视频url
 *     AlarmPicPath                    string                          `json:"apic"`       // 图片路径
 *     AlarmVideoPath                  string                          `json:"avd"`        // 视频路径
 *     AlarmMessage                    string                          `json:"amsg"`       // 备注消息
 * }
 */
public class AlarmMsgDto {

    private String deviceId;
    private String alarmId;
    private Integer alarmStoreType;
    private Integer alarmMsgType;
    private String deviceName;
    private Integer deviceType;
    private Integer deviceChannelNumber;
    private Integer alarmType;
    private Date alarmTime;
    private String alarmPicURL;
    private String alarmVideoURL;
    private String alarmPicPath;
    private String alarmVideoPath;
    private String alarmMessage;
}
