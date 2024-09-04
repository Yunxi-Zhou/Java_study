public class Runner {
    public static void main(String[] args) {
        RecLL L = new RecLL(1);
        RecLLUtil.append(L,2);
        RecLLUtil.append(L,3);
        RecLLUtil.append(L,3);
        RecLLUtil.append(L,3);
        RecLLUtil.append(L,3);
        RecLLUtil.append(L,4);
        RecLLUtil.append(L,5);
        RecLLUtil.print(L);
        RecLLUtil.removeAll(L,3);
        RecLLUtil.print(L);

    }
}
