module de.snaggly.bossmodellerfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.google.gson;

    opens de.snaggly.bossmodellerfx to javafx.fxml;
    exports de.snaggly.bossmodellerfx;
    exports de.snaggly.bossmodellerfx.view.controller;
    opens de.snaggly.bossmodellerfx.view.controller to javafx.fxml;
    exports de.snaggly.bossmodellerfx.model;
    exports de.snaggly.bossmodellerfx.guiLogic;
    exports de.snaggly.bossmodellerfx.view;
    exports de.snaggly.bossmodellerfx.view.viewtypes;
    exports de.snaggly.bossmodellerfx.struct.relations;
}