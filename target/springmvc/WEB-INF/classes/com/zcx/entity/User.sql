-- auto Generated on 2018-09-12 15:12:11 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE `user`(
	`username` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'username',
	`sex` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'sex',
	`birthday` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'birthday',
	`address` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'address',
	`company_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'companyId',
	`order_id` VARCHAR (50) NOT NULL AUTO_INCREMENT COMMENT 'orderId',
	`customer_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'customerId',
	`customer_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'customerName',
	`course_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'courseId',
	`course_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'courseName',
	`teacher_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'teacherId',
	`teacher_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'teacherName',
	`order_number` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'orderNumber',
	`course_period` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'coursePeriod',
	`order_reason` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'orderReason',
	`order_time` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'orderTime',
	`pay_time` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'payTime',
	`order_state` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'orderState',
	PRIMARY KEY (`order_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`user`';
