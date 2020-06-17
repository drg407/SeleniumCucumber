Feature: When I go to the Google search page, and search for an item, I expect to see some reference to that item in the result summary.

    @example
    Scenario: Search for items and validate results
        Given that I have gone to the Google page
        When I add "cats" to the search box
        And click the Search Button
        Then a follow button should be displayed

    @example
    Scenario Outline: Search for items and validate Follow this topic
        Given that I have gone to the Google page
        When I add <searchTerm> to the search
        And click the Search Button
        And click the Follow button
        Then a sign in window will appear

        Examples:
            | searchTerm |
            | dogs       |
            | birds      |