Feature: Game Score

  Scenario Outline: The game keeps score
    Given: a <scoreSheet> for a player
    When: a game score is requested
    Then: a <totalScore> for the game is provided

    Examples:
      | | |