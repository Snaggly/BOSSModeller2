package de.snaggly.bossmodellerfx;

import java.util.ResourceBundle;

/**
 * Gets translated string from ResourceBundle "strings".
 * Language is set by current system Locale or by messing with default Locale.
 * @author Omar Emshani
 */
public class BOSS_Strings {
    public static final ResourceBundle resourceBundle = ResourceBundle.getBundle("de.snaggly.bossmodellerfx.strings");
    public static final String PRODUCT_NAME = resourceBundle.getString("bossmodellerfx");
    public static final String NEW_PROJECT = resourceBundle.getString("new.project");
    public static final String EDIT_ENTITY = resourceBundle.getString("edit.entity");
    public static final String DELETE_ENTITY = resourceBundle.getString("delete.entity");
    public static final String ABOUT_US = resourceBundle.getString("about.us");
    public static final String EDIT_COMMENT = resourceBundle.getString("edit.comment");
    public static final String DELETE_COMMENT = resourceBundle.getString("delete.comment");
    public static final String EDIT_RELATION = resourceBundle.getString("edit.relation");
    public static final String DELETE_RELATION = resourceBundle.getString("delete.relation");
    public static final String MOVE_TO_FRONT = resourceBundle.getString("MOVE_TO_FRONT");
    public static final String MOVE_TO_BACK = resourceBundle.getString("MOVE_TO_BACK");
    public static final String NEW_ENTITY = resourceBundle.getString("NEW_ENTITY");
    public static final String NEW_COMMENT = resourceBundle.getString("NEW_COMMENT");
    public static final String NEW_RELATION = resourceBundle.getString("NEW_RELATION");
    public static final String NO_ENTITIES_WARNING = resourceBundle.getString("NO_ENTITIES_WARNING");
    public static final String NO_ENTITY_SELECTED = resourceBundle.getString("NO_ENTITY_SELECTED");
    public static final String NO_COMMENT_SELECTED = resourceBundle.getString("NO_COMMENT_SELECTED");
    public static final String NO_RELATION_SELECTED = resourceBundle.getString("NO_RELATION_SELECTED");
    public static final String OPEN_PROJECT = resourceBundle.getString("OPEN_PROJECT");
    public static final String SAVE_PROJECT = resourceBundle.getString("SAVE_PROJECT");
    public static final String SAVE_SQL = resourceBundle.getString("SAVE_SQL");
    public static final String DEFAULT_COMMENT_STRING = resourceBundle.getString("DEFAULT_COMMENT_STRING");
    public static final String EXPORT_TO_PICTURE = resourceBundle.getString("EXPORT_TO_PICTURE");
    public static final String DEFAULT_NEWPROJECT_NAME = resourceBundle.getString("DEFAULT_NEWPROJECT_NAME");
    public static final String RENAME = resourceBundle.getString("RENAME");
    public static final String CLOSE = resourceBundle.getString("CLOSE");
    public static final String ENTER_NEW_PROJECTNAME = resourceBundle.getString("ENTER_NEW_PROJECTNAME");
    public static final String PROJECT_NAME = resourceBundle.getString("PROJECT_NAME");
    public static final String LAST_TAB_WARNING = resourceBundle.getString("LAST_TAB_WARNING");
    public static final String IMPORTED_PROJECT = resourceBundle.getString("IMPORTED_PROJECT");
    public static final String CHOOSE_TABLES = resourceBundle.getString("CHOOSE_TABLES");
    public static final String CONNECT_TO_DATABASE = resourceBundle.getString("CONNECT_TO_DATABASE");
    public static final String CHOOSE_DATABASE_AND_SCHEMA = resourceBundle.getString("CHOOSE_DATABASE_AND_SCHEMA");
    public static final String NEW_UNIQUE_NAME_PROMPT = resourceBundle.getString("NEW_UNIQUE_NAME_PROMPT");
    public static final String RELATION_INFO_ONE1 = resourceBundle.getString("RELATION_INFO_ONE1");
    public static final String RELATION_INFO_ONE2 = resourceBundle.getString("RELATION_INFO_ONE2");
    public static final String RELATION_INFO_CAN = resourceBundle.getString("RELATION_INFO_CAN");
    public static final String RELATION_INFO_MUST = resourceBundle.getString("RELATION_INFO_MUST");
    public static final String RELATION_INFO_MANY = resourceBundle.getString("RELATION_INFO_MANY");
    public static final String RELATION_INFO_HAS = resourceBundle.getString("RELATION_INFO_HAS");
    public static final String RELATION_INFO = resourceBundle.getString("RELATION_INFO");
    public static final String ENTITY_EDIT_ATTRIBUTED_USED_IN_FKS = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTED_USED_IN_FKS");
    public static final String ENTITY_EDIT_FK_DELETE_WARNING = resourceBundle.getString("ENTITY_EDIT_FK_DELETE_WARNING");
    public static final String ENTITY_EDIT_NO_NAME_HEADER = resourceBundle.getString("ENTITY_EDIT_NO_NAME_HEADER");
    public static final String ENTITY_EDIT_NO_NAME_WARNING = resourceBundle.getString("ENTITY_EDIT_NO_NAME_WARNING");
    public static final String ENTITY_EDIT_ATTRIBUTES_NO_DATATYPE_WARNING = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTES_NO_DATATYPE_WARNING");
    public static final String ENTITY_EDIT_ATTRIBUTES_NO_DATATYPE_HEADER = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTES_NO_DATATYPE_HEADER");
    public static final String ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_HEADER = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_HEADER");
    public static final String ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_THE_ATTRIBUTE = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_THE_ATTRIBUTE");
    public static final String ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_USED_MULTIPLE_TIMES = resourceBundle.getString("ENTITY_EDIT_ATTRIBUTES_IDENTICAL_NAME_USED_MULTIPLE_TIMES");
    public static final String ENTITY_EDIT_IDENTICAL_NAME_WARNING = resourceBundle.getString("ENTITY_EDIT_IDENTICAL_NAME_WARNING");
    public static final String ENTITY_EDIT_IDENTICAL_NAME_HEADER = resourceBundle.getString("ENTITY_EDIT_IDENTICAL_NAME_HEADER");
    public static final String ENTITY_EDIT_NO_ATTRIBUTES_HEADER = resourceBundle.getString("ENTITY_EDIT_NO_ATTRIBUTES_HEADER");
    public static final String ENTITY_EDIT_NO_ATTRIBUTES_WARNING = resourceBundle.getString("ENTITY_EDIT_NO_ATTRIBUTES_WARNING");
    public static final String UNIQUE_COMBO_EDITOR_TITLE = resourceBundle.getString("UNIQUE_COMBO_EDITOR_TITLE");
    public static final String ATTRIBUTE_EDITOR_FK_TO = resourceBundle.getString("ATTRIBUTE_EDITOR_FK_TO");
    public static final String DB_CONNECTOR = resourceBundle.getString("DB_CONNECTOR");
    public static final String CONNECTION_ERROR = resourceBundle.getString("CONNECTION_ERROR");
    public static final String COULD_NOT_CREATE_DBINTERFACE = resourceBundle.getString("COULD_NOT_CREATE_DBINTERFACE");
    public static final String DBINTERFACE_NO_SCHEMA_HEADER = resourceBundle.getString("DBINTERFACE_NO_SCHEMA_HEADER");
    public static final String DBINTERFACE_NO_SCHEMA_WARNING = resourceBundle.getString("DBINTERFACE_NO_SCHEMA_WARNING");
    public static final String DBINTERFACE_EXISTING_NAME_HEADER = resourceBundle.getString("DBINTERFACE_EXISTING_NAME_HEADER");
    public static final String DBINTERFACE_EXISTING_DB_WARNING = resourceBundle.getString("DBINTERFACE_EXISTING_DB_WARNING");
    public static final String DBINTERFACE_EXISTING_SCHEMA_WARNING = resourceBundle.getString("DBINTERFACE_EXISTING_SCHEMA_WARNING");
    public static final String DBINTERFACE_SQL_ERROR = resourceBundle.getString("DBINTERFACE_SQL_ERROR");
    public static final String DBINTERFACE_SQL_LANGUAGE_ERROR = resourceBundle.getString("DBINTERFACE_SQL_LANGUAGE_ERROR");
    public static final String DBINTERFACE_ERROR_READING_TABLES = resourceBundle.getString("DBINTERFACE_ERROR_READING_TABLES");
    public static final String RELATION_EDITOR = resourceBundle.getString("RELATION_EDITOR");
    public static final String RELATION_EDITOR_PROMPT_IF_TABLEA_GETS_FK = resourceBundle.getString("RELATION_EDITOR_PROMPT_IF_TABLEA_GETS_FK");
    public static final String RELATION_EDITOR_TRIGGER_WARNING = resourceBundle.getString("RELATION_EDITOR_TRIGGER_WARNING");
    public static final String RELATION_EDITOR_TRIGGER_WARNING_HEADER = resourceBundle.getString("RELATION_EDITOR_TRIGGER_WARNING_HEADER");
    public static final String RELATION_EDITOR_TRANSFORMATION_WARNING = resourceBundle.getString("RELATION_EDITOR_TRANSFORMATION_WARNING");
    public static final String RELATION_EDITOR_TRANSFORMATION_WARNING_HEADER = resourceBundle.getString("RELATION_EDITOR_TRANSFORMATION_WARNING_HEADER");
    public static final String JSON_FILE = resourceBundle.getString("JSON_FILE");
    public static final String PNG_FILE = resourceBundle.getString("PNG_FILE");
    public static final String SQL_FILE = resourceBundle.getString("SQL_FILE");
    public static final String LEGACY_ERROR_LOADING_DRIVER = resourceBundle.getString("LEGACY_ERROR_LOADING_DRIVER");
    public static final String LEGACY_INSERT_SCHEMA = resourceBundle.getString("LEGACY_INSERT_SCHEMA");
    public static final String LEGACY_MYSQL_CHECK_CONSTRAINT_WARNING = resourceBundle.getString("LEGACY_MYSQL_CHECK_CONSTRAINT_WARNING");
    public static final String LEGACY_WARNING = resourceBundle.getString("LEGACY_WARNING");
    public static final String LEGACY_CHECK_SERVER_CASESENSITIVE = resourceBundle.getString("LEGACY_CHECK_SERVER_CASESENSITIVE");
    public static final String LEGACY_PROMPT_OVERRIDING_EXISTING_FILE = resourceBundle.getString("LEGACY_PROMPT_OVERRIDING_EXISTING_FILE");
    public static final String LEGACY_FILE_CONFLICT = resourceBundle.getString("LEGACY_FILE_CONFLICT");
    public static final String LEGACY_SQL_FILE_CREATION_SUCCESS = resourceBundle.getString("LEGACY_SQL_FILE_CREATION_SUCCESS");
    public static final String LEGACY_SUCCESS = resourceBundle.getString("LEGACY_SUCCESS");
    public static final String LEGACY_SQLCOILDNOTBESAVED = resourceBundle.getString("LEGACY_sqlCouldNotBeSaved");
    public static final String LEGACY_ERROR = resourceBundle.getString("LEGACY_ERROR");
    public static final String TABLE = resourceBundle.getString("table");
    public static final String ATTRIBUTE = resourceBundle.getString("attribute");
    public static final String SQL_DISPLAY = resourceBundle.getString("SQL_DISPLAY");
    public static final String DESCRIPTOR_START_NEW_PROJECT = resourceBundle.getString("DESCRIPTOR_START_NEW_PROJECT");
    public static final String DESCRIPTOR_OPEN_PROJECT = resourceBundle.getString("DESCRIPTOR_OPEN_PROJECT");
    public static final String DESCRIPTOR_SAVE_PROJECT = resourceBundle.getString("DESCRIPTOR_SAVE_PROJECT");
    public static final String DESCRIPTOR_EXPORT_PICTURE = resourceBundle.getString("DESCRIPTOR_EXPORT_PICTURE");
    public static final String DESCRIPTOR_DB_IMPORT = resourceBundle.getString("DESCRIPTOR_DB_IMPORT");
    public static final String DESCRIPTOR_DB_EXPORT = resourceBundle.getString("DESCRIPTOR_DB_EXPORT");
    public static final String DESCRIPTOR_EXPORT_SQL = resourceBundle.getString("DESCRIPTOR_EXPORT_SQL");
    public static final String DESCRIPTOR_NEW_ENTITY = resourceBundle.getString("DESCRIPTOR_NEW_ENTITY");
    public static final String DESCRIPTOR_EDIT_ENTITY = resourceBundle.getString("DESCRIPTOR_EDIT_ENTITY");
    public static final String DESCRIPTOR_DELETE_ENTITY = resourceBundle.getString("DESCRIPTOR_DELETE_ENTITY");
    public static final String DESCRIPTOR_NEW_RELATION = resourceBundle.getString("DESCRIPTOR_NEW_RELATION");
    public static final String DESCRIPTOR_EDIT_RELATION = resourceBundle.getString("DESCRIPTOR_EDIT_RELATION");
    public static final String DESCRIPTOR_DELETE_RELATION = resourceBundle.getString("DESCRIPTOR_DELETE_RELATION");
    public static final String DESCRIPTOR_NEW_COMMENT = resourceBundle.getString("DESCRIPTOR_NEW_COMMENT");
    public static final String DESCRIPTOR_DELETE_COMMENT = resourceBundle.getString("DESCRIPTOR_DELETE_COMMENT");
    public static final String TRY_DIFFERENT_DBNAME_PROMPT = resourceBundle.getString("TRY_DIFFERENT_DBNAME_PROMPT");
    public static final String TRY_DIFFERENT_DBNAME_HEADER = resourceBundle.getString("TRY_DIFFERENT_DBNAME_HEADER");
}
