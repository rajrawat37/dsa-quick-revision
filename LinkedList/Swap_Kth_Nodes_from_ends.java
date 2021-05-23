 Node swapkthnode(Node head, int n, int k)
    {
      if (k > n || 2 * k - 1 == n) return head;
      Node first = head, second = head, fp = null, sp = null;
    int index = k - 1;
    while (index-- > 0) {
        fp = first;
        first = first.next;
    }
    index = n - k;
    while (index-- > 0) {
        sp = second;
        second = second.next;
    }
    if (fp != null) fp.next = second;
    if (sp != null) sp.next = first;
    Node fn = first.next;
    first.next = second.next;
    second.next = fn;
    if (k == 1) head = second;
    if (k == n) head = first;
    return head; 
}
