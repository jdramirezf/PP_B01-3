# PP_B01-3
NIVEL 1
<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Accordion?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.MenuButton?>
<?import javafx.scene.control.MenuItem?>
<?import javafx.scene.control.ProgressBar?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.text.Font?>

<AnchorPane id="AnchorPane" prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/19" xmlns:fx="http://javafx.com/fxml/1" fx:controller="proyecto1.VentanaController">
   <children>
      <Button layoutX="91.0" layoutY="188.0" mnemonicParsing="false" text="A" />
      <Button layoutX="328.0" layoutY="188.0" mnemonicParsing="false" text="B" />
      <Button layoutX="327.0" layoutY="270.0" mnemonicParsing="false" text="D" />
      <Button layoutX="91.0" layoutY="270.0" mnemonicParsing="false" text="C" />
      <Accordion layoutX="79.0" layoutY="23.0" />
      <Label layoutX="257.0" layoutY="28.0" prefHeight="35.0" prefWidth="86.0" text="NIVEL 1" textAlignment="RIGHT">
         <font>
            <Font name="System Bold" size="22.0" />
         </font>
      </Label>
      <Label layoutX="200.0" layoutY="69.0" prefHeight="25.0" prefWidth="180.0" text="Selecciona la respuesta correta" textAlignment="CENTER" textFill="#dd3d10" />
      <ProgressBar layoutX="30.0" layoutY="45.0" prefHeight="18.0" prefWidth="123.0" progress="0.0" />
      <MenuButton layoutX="470.0" layoutY="352.0" mnemonicParsing="false" text="MenuButton">
        <items>
          <MenuItem mnemonicParsing="false" text="Action 1" />
          <MenuItem mnemonicParsing="false" text="Action 2" />
        </items>
      </MenuButton>
      <Label layoutX="42.0" layoutY="63.0" prefHeight="18.0" prefWidth="99.0" text="Barra de Progreso" textAlignment="CENTER" textFill="#171717" />
      <Label layoutX="67.0" layoutY="114.0" prefHeight="50.0" prefWidth="479.0" text="¿Cómo se conoce el nuevo tipo de organización social que surgió en las comunidades indígenas de Colombia durante la época precolombina?" textAlignment="JUSTIFY" textFill="#1c19bf" wrapText="true">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
      <Label layoutX="141.0" layoutY="183.0" prefHeight="35.0" prefWidth="80.0" text="tribalismo" textAlignment="JUSTIFY" textFill="#1c19bf" wrapText="true">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
      <Label layoutX="380.0" layoutY="183.0" prefHeight="35.0" prefWidth="80.0" text="Cacicazgo" textAlignment="JUSTIFY" textFill="#1c19bf" wrapText="true">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
      <Label layoutX="141.0" layoutY="265.0" prefHeight="35.0" prefWidth="80.0" text="Feudalismo" textAlignment="JUSTIFY" textFill="#1c19bf" wrapText="true">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
      <Label layoutX="380.0" layoutY="265.0" prefHeight="35.0" prefWidth="80.0" text="Monarquia" textAlignment="JUSTIFY" textFill="#1c19bf" wrapText="true">
         <font>
            <Font size="15.0" />
         </font>
      </Label>
   </children>
   <opaqueInsets>
      <Insets />
   </opaqueInsets>
</AnchorPane>
