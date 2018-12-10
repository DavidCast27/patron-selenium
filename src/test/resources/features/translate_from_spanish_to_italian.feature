Feature:
  I, as a language student,
  want to translate a text from Spanish to Italian
  to finish my homework

  Scenario: must show the translated text
    Given I enter the google translate app
    When I translated from "SPANISH" to "ENGLISH" the text "traducir este texto"
    Then I should see the translation "translate this text"
