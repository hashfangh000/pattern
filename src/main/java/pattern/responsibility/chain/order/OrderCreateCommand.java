package pattern.responsibility.chain.order;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: Bitfh
 * @create: 2023/8/15
 **/
@AllArgsConstructor
@Data
public class OrderCreateCommand {
    private String param;
}
