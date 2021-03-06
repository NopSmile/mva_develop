package com.itcc.mva.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
/**
 * @author whoami
 */
@Data
@TableName(value="T_QC_INTELLIGENT_ASR")
public class IntelligentAsrEntity {

    @TableId(value = "PID")
    private String pid;
    @TableField(value = "LOG_ID")
    private String logId;
    @TableField(value = "LEAV_WORD_TIME")
    private String leavWordTime;
    @TableField(value = "ANI")
    private String ani;
    @TableField(value = "LEAVEWORD_PATH")
    private String leavewordPath;
    @TableField(value = "VOICE_FILE_NAME")
    private String voiceFileName;
    @TableField(value = "OUTPUT_FILEPATH")
    private String outputFilepath;
    @TableField(value = "OUTPUT_FILENAME")
    private String outputFilename;
    @TableField(value = "ASR_STATUS")
    private String asrStatus;
    @TableField(value = "ASR_TIMESTAMP")
    private Date asrTimestamp;
    @TableField(value = "ASR_FAILTIMES")
    private String asrFailtimes;
    @TableField(value = "DATAGENERATE_TIME")
    private Date datagenerateTime;
    @TableField(value = "JSONPARSE_STATUS")
    private Integer jsonparseStatus;
    @TableField(value = "JSONPARSE_RESULT")
    private String jsonparseResult;
    @TableField(value = "CALLID")
    private String callid;
    @TableField(value = "ISSUBMIT")
    private Integer issubmit;
    @TableField(value = "FULL_PATH")
    private String fullPath;
}
