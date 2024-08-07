/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/backup_schedule.proto

// Protobuf Java Version: 3.25.3
package com.google.spanner.admin.database.v1;

public interface ListBackupSchedulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.ListBackupSchedulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of backup schedules for a database.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.BackupSchedule backup_schedules = 1;</code>
   */
  java.util.List<com.google.spanner.admin.database.v1.BackupSchedule> getBackupSchedulesList();
  /**
   *
   *
   * <pre>
   * The list of backup schedules for a database.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.BackupSchedule backup_schedules = 1;</code>
   */
  com.google.spanner.admin.database.v1.BackupSchedule getBackupSchedules(int index);
  /**
   *
   *
   * <pre>
   * The list of backup schedules for a database.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.BackupSchedule backup_schedules = 1;</code>
   */
  int getBackupSchedulesCount();
  /**
   *
   *
   * <pre>
   * The list of backup schedules for a database.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.BackupSchedule backup_schedules = 1;</code>
   */
  java.util.List<? extends com.google.spanner.admin.database.v1.BackupScheduleOrBuilder>
      getBackupSchedulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of backup schedules for a database.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.BackupSchedule backup_schedules = 1;</code>
   */
  com.google.spanner.admin.database.v1.BackupScheduleOrBuilder getBackupSchedulesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListBackupSchedules][google.spanner.admin.database.v1.DatabaseAdmin.ListBackupSchedules]
   * call to fetch more of the schedules.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListBackupSchedules][google.spanner.admin.database.v1.DatabaseAdmin.ListBackupSchedules]
   * call to fetch more of the schedules.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
