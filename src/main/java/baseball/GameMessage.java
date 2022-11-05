package baseball;

public enum GameMessage {
    PLAY_BALL("숫자 야구 게임을 시작합니다."),
    REQUEST_GUESS("숫자를 입력해주세요 : "),
    GAME_CLEAR("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}