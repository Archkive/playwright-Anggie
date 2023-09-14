Feature: Kecak

  @ShipmentTest
  Scenario: Login user
    Given input "anggie.rinovka" in username
    Given input "anggie.rinovka" in password
    Then login with username and password that filled
    Given navigate to welcome page
    Given click sales section
    Given click create order shipment
    Given input data "paracetamol" and "credit card" in order section
    Given input data for shipment section
    Given click save button

#  @ShipmentCreate
#  Scenario: Input data in Shipment Section for create shipment
#    Given input username "anggie.rinovka"
#    Given input password "anggie.rinovka"
#    Then login with username and password that filled
#    Given navigate to welcome page2
#    Given click to shipment section
#    Given click create shipment
#    Given input data for shipment section2
#    Given input data for shipment item
#    Given click save button2
#
#  @MasterDataProduct
#  Scenario: Input data in Product
#    Given input username "anggie.rinovka"
#    Given input password "anggie.rinovka"
#    Then login with username and password that filled
#    Given navigate to welcome page3
#    Given click to master data section
#    Given click product
#    Given input data for product
#    Given click save button3
#
#   @MasterDataBusinessPartner
#   Scenario: Input data in bisnisPartner
#     Given input username "anggie.rinovka"
#     Given input password "anggie.rinovka"
#     Then login with username and password that filled
#     Given navigate to welcome page4
#     Given click to master data section2
#     Given Click bisnisPartner
#     Given input data for bisnisPartner
#     Given click save button4