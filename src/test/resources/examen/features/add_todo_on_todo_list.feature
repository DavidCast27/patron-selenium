Feature:
  I, as student
  I want to add a to-do
  To see it on my to-do list

  Scenario: must show the new to-do on the to-do list
    Given I enter the todomvc app
    When I added my to-do "my first task"
    Then I should see my new to-do on to-do list
