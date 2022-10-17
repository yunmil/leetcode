class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []
        
        hashmap = {")":"(", "}":"{", "]":"["}
        
        print(hashmap)
        
        
        for ch in s:
            if ch in hashmap: #only check key value of hashmap meaning closing bracket
                top_ele = stack.pop() if stack else '#'
                
                if top_ele != hashmap[ch]: #in this case hashmap[ch] will only about hashmap[)] or hashmap[}] or hashmap[]] since it is only accepting key value which is closing bracket and hashmap[closing bracket] is equal to value of the hashmap that is opening bracket 
                    return False
            else:
                stack.append(ch)
        
        return not stack 
            
