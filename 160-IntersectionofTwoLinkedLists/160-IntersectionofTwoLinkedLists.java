
        // Traverse both lists
        while (pA != pB) {
            // Move to the next node, or reset to the head of the other list if end is reached
            pA = (pA != null) ? pA.next : headB;
            pB = (pB != null) ? pB.next : headA;
        }

        // pA and pB will either meet at the intersection or at the end (null)
        return pA;
    }
}

