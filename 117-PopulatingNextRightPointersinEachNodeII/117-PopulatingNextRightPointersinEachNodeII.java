                    } else {
                        head = current.right;
                    }
                    prev = current.right;
                }
                // move to next node
                current = current.next;
            }

            // move to next level
            current = head;
            head = null;
            prev = null;
        }

        return root;
    }
}

[
