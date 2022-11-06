package Builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           // 文档内容保存在该字段中
    public void makeTitle(String title) {                       // 纯文本的标题
        buffer.append("==============================\n");      // 装饰线
        buffer.append("『" + title + "』\n");                   // 为标题添加『』
        buffer.append("\n");                                    // 换行
    }
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("　?" + items[i] + "\n");
        }
        buffer.append("\n");
    }
    public void close() {
        buffer.append("==============================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
